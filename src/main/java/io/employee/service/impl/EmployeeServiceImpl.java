package io.employee.service.impl;

import io.employee.bean.model.EmployeeUser;
import io.employee.bean.para.InsertUserPara;
import io.employee.bean.para.SelectUserPara;
import io.employee.service.EmployeeService;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private SqlSession masterDao;
	@Autowired
	private SqlSession slaveDao;
	@Autowired
    private Configuration configuration;
	@Autowired
	private Md5PasswordEncoder passwordEncoder;

	@Override
	public boolean insertEmployeeUser(InsertUserPara insertUserPara)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getEmployeeUserSum() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeUser selectEmployeeUser(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeUser> selectEmployeeUserList(SelectUserPara selectAdminPara) throws Exception {

		return null;
	}

}