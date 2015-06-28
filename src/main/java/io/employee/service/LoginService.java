package io.employee.service;

import io.employee.bean.para.login.SignUpPara;

public interface LoginService {

	public void sendEmail(SignUpPara signUpPara) throws Exception;

}