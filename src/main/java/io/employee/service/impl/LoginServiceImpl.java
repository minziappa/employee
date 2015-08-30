package io.employee.service.impl;

import java.util.HashMap;
import java.util.Map;

import io.employee.bean.model.EmployeeUserTemp;
import io.employee.bean.para.login.RegisterPwdPara;
import io.employee.bean.para.login.SignUpPara;
import io.employee.dao.UserMasterDao;
import io.employee.service.LoginService;
import io.employee.service.UserService;
import io.utility.cipher.CipherUtility;
import io.utility.mail.EmailBean;
import io.utility.mail.Emailer;
import io.utility.utile.TokenUtility;

import org.apache.commons.configuration.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {

	final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	private SqlSession masterDao;
	@Autowired
	private SqlSession slaveDao;
	@Autowired
	private UserService userService;
	@Autowired
    private Configuration configuration;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	private CipherUtility cu = new CipherUtility("tkfkagody");

	private String sendEmail(SignUpPara signUpPara, String token) throws Exception {

		String token1 = cu.encrypt(signUpPara.getUserEmail());

		EmailBean email = new EmailBean();
		email.setTo(signUpPara.getUserEmail());
		email.setFrom("higuybugs@gmail.com");

		StringBuffer sb = new StringBuffer();
		sb.append("This is a test /n/r");
		sb.append("http://localhost:8080/employee/login/confirmSingup?token1=" + token1 + "&token2=" + token);
		email.setMsg(sb.toString());
		email.setSubject("Please, complete your register");

		Emailer.sendEmail(email, "email@gamil", "password");

		return token;
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	private boolean insertUserTemp(SignUpPara signUpPara, String token2) throws Exception {

		long seqNum = 0;

		Map<String, Object> mapSeq = new HashMap<String, Object>();
		mapSeq.put("seqName", "userTemp");
		try {
			seqNum = masterDao.getMapper(UserMasterDao.class).updateSequeceUserTemp(mapSeq);
		} catch (Exception e) {
			logger.error("Exception error - updateSequece", e);
			throw e;
		}

		Map<String, Object> mapUserTemp = new HashMap<String, Object>();
		String encoded = passwordEncoder.encode(signUpPara.getUserEmail());
		logger.warn("seqNum >> " + seqNum);

		mapUserTemp.put("userTempNum", seqNum);
		mapUserTemp.put("userTempEmail", encoded);
		mapUserTemp.put("userTempToken", token2);
		mapUserTemp.put("userTempStatus", "0");

		int intResult = 0;
		try {
			intResult = masterDao.getMapper(UserMasterDao.class).insertUserTemp(mapUserTemp);
		} catch (Exception e) {
			logger.error("Exception error - updateSequece", e);
			throw e;
		}

		if(intResult < 1) {
			logger.error("insertUserTemp error, userEmail={}", signUpPara.getUserEmail());
			return false;
		}

		return true;
	}

	@Override
	public void registerUserTemp(SignUpPara signUpPara) throws Exception {

		String token2 = TokenUtility.generateToken(signUpPara.getUserEmail());

		insertUserTemp(signUpPara, token2);
		this.sendEmail(signUpPara, token2);
	}

	@Override
	public void checkToken(String token) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertUser(RegisterPwdPara registerPwdPara) throws Exception {

		long seqNum = 0;

		EmployeeUserTemp userTemp = userService.selectEmployeeUserTemp(registerPwdPara.getPassword());
		if(userTemp == null) {
			return false;
		}
		StringBuffer sb = new StringBuffer();
		sb.append("JOONKY").append(userTemp.getUserTempNum());

		Map<String, Object> mapUserTemp = new HashMap<String, Object>();
		String encodedPwd = passwordEncoder.encode(registerPwdPara.getPassword());
		logger.warn("seqNum >> " + seqNum);

		mapUserTemp.put("userNum", seqNum);
		mapUserTemp.put("userId", sb.toString());
		mapUserTemp.put("userEmail", encodedPwd);
		mapUserTemp.put("userCode", "0001");
		mapUserTemp.put("userPwd", encodedPwd);
		mapUserTemp.put("userNameFirst", "first name");
		mapUserTemp.put("userNameLast", "last name");

		int intResult = 0;
		try {
			intResult = masterDao.getMapper(UserMasterDao.class).insertUserTemp(mapUserTemp);
		} catch (Exception e) {
			logger.error("Exception error - updateSequece", e);
		}

		if(intResult < 1) {
			logger.error("insertUserTemp error, userEmail={}", registerPwdPara.getPassword());
			return false;
		}

		return false;
	}

}