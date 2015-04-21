package io.sample.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import io.employee.bean.EmployeeBean;
import io.employee.bean.model.EmployeeUser;
import io.employee.bean.para.InsertUserPara;
import io.employee.bean.para.SelectUserPara;
import io.employee.service.EmployeeService;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class EmployeeServiceImplTest {

	@Autowired
    EmployeeService employeeService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	public void testSelectemployee() throws Exception {
		SelectUserPara selectUserPara = new SelectUserPara();
		selectUserPara.setUserName("admin");
		selectUserPara.setUserData("2014-08-10");
		List<EmployeeUser> userList = employeeService.selectEmployeeUserList(selectUserPara);
		assertNotNull(userList);
	}

	@Test
	public void testDeleteemployee() throws Exception {
		EmployeeUser employeeUser = employeeService.selectEmployeeUser("name");
	}

}