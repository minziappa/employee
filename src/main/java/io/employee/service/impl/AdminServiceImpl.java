package io.employee.service.impl;

import io.employee.bean.model.admin.ManagementAdmin;
import io.employee.bean.para.InsertUserPara;
import io.employee.bean.para.admin.SelectAdminPara;
import io.employee.service.AdminService;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

	final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

	@Autowired
	private SqlSession adminMasterDao;
	@Autowired
	private SqlSession adminSlaveDao;
	@Autowired
    private Configuration configuration;
	@Autowired
	private Md5PasswordEncoder passwordEncoder;

	@Override
	public boolean insertemployee(InsertUserPara insertUserPara)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getAdminSum() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ManagementAdmin selectemployeeByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ManagementAdmin> selectAdminList(SelectAdminPara selectAdminPara)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}