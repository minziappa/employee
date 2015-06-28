package io.employee.service.impl;

import io.employee.bean.para.login.SignUpPara;
import io.employee.service.LoginService;
import io.utility.mail.EmailBean;
import io.utility.mail.Emailer;

import org.apache.commons.configuration.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
    private Configuration configuration;

	@Override
	public void sendEmail(SignUpPara signUpPara) throws Exception {

		EmailBean email = new EmailBean();
		email.setTo(signUpPara.getUserEmail());
		email.setFrom("higuybugs@gmail.com");

		email.setMsg("This is a test");
		email.setSubject("Please, complete your register");

		Emailer.sendEmail(email, "higuybugs@gmail.com", "heyheypassword");
	}

}