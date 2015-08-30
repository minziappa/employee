package io.employee.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class SignUpPara {

    @NotNull(message = "userEmail.")
    @Email(message = "You should form for email.")
    @Size(min = 1, max = 45 ,message = "userEmail must not exceed {max} characters")
	private String userEmail;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}