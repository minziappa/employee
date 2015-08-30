package io.employee.service.impl;

import io.employee.bean.model.EmployeeUser;
import io.employee.bean.model.EmployeeUserTemp;
import io.employee.bean.para.InsertUserPara;
import io.employee.bean.para.RegisterAdminPara;
import io.employee.bean.para.SelectUserPara;
import io.employee.bean.para.login.RegisterPwdPara;
import io.employee.bean.para.login.SignUpPara;
import io.employee.dao.MasterDao;
import io.employee.dao.UserMasterDao;
import io.employee.dao.UserSlaveDao;
import io.employee.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class UserServiceImpl implements UserService {

	final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private SqlSession masterDao;
	@Autowired
	private SqlSession slaveDao;
	@Autowired
    private Configuration configuration;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public int getEmployeeUserSum() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public EmployeeUser selectEmployeeUser(String userId) throws Exception {
		
		EmployeeUser user = null;
		
		Map<String, Object> mapSeq = new HashMap<String, Object>();
		mapSeq.put("userId", "userId");

		try {
			user = slaveDao.getMapper(UserSlaveDao.class).selectUser(mapSeq);
		} catch (Exception e) {
			logger.error("Exception error - updateSequece", e);
		}

		return user;
	}

	@Override
	public EmployeeUserTemp selectEmployeeUserTemp(String userTempEmail) throws Exception {

		EmployeeUserTemp userTemp = null;
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userTempEmail", userTempEmail);

		try {
			userTemp = slaveDao.getMapper(UserSlaveDao.class).selectUserTemp(map);
		} catch (Exception e) {
			logger.error("Exception error - updateSequece", e);
		}

		return userTemp;
	}

	@Override
	public List<EmployeeUser> selectEmployeeUserList(SelectUserPara selectAdminPara) throws Exception {

		return null;
	}

}