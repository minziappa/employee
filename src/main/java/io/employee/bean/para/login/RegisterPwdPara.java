package io.employee.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class RegisterPwdPara {

    @NotNull(message = "password.")
    @Email(message = "You should form for your password.")
    @Size(min = 1, max = 45 ,message = "password must not exceed {max} characters")
	private String password;

    @NotNull(message = "password2.")
    @Email(message = "You should form for your password2.")
    @Size(min = 1, max = 45 ,message = "password2 must not exceed {max} characters")
	private String password2;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

}