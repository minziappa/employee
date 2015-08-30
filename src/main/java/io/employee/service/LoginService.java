package io.employee.service;

import io.employee.bean.para.login.RegisterPwdPara;
import io.employee.bean.para.login.SignUpPara;

public interface LoginService {

	public void registerUserTemp(SignUpPara signUpPara) throws Exception;
	public void checkToken(String token) throws Exception;

	public boolean insertUser(RegisterPwdPara registerPwdPara) throws Exception;

}