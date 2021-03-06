package io.employee.controller;

import io.employee.bean.para.SelectUserPara;
import io.employee.bean.para.UserDetailPara;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

	final Logger logger = LoggerFactory.getLogger(UserValidator.class);

	@Override
	public boolean supports(Class<?> clazz) {
		if(SelectUserPara.class.equals(clazz)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void validate(Object object, Errors errors) {
		if (object instanceof SelectUserPara) {
			SelectUserPara selectUserPara = (SelectUserPara) object;

	        if(selectUserPara != null) {
	    		if(selectUserPara.getUserName() == null){
					errors.rejectValue("validate", "employee.parameter.error.message");
					logger.warn("the name is error.");
					// If you want to set the default value, remove the comment
	    			// selectUserPara.setUserName("user");
	    		}
	        }

		} else if(object instanceof UserDetailPara) {
			UserDetailPara userDetailPara = (UserDetailPara) object;

	        if(userDetailPara != null) {
	    		if(userDetailPara.getUserName() == null){
					errors.rejectValue("validate", "employee.parameter.error.message");
					logger.warn("the name is error.");
					// If you want to set the default value, remove the comment
	    			// selectUserPara.setUserName("user");
	    		}
	        }

		}
		
		
	}

}
