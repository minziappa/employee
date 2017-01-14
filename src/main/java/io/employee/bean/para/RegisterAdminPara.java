package io.employee.bean.para;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

public class RegisterAdminPara {

    @NotNull(message = "adminName")
    @Size(min = 1, max = 45 ,message = "adminName must not exceed {max} characters")
	private String adminName;
    @NotNull(message = "adminPwd")
    @Size(min = 1, max = 2 ,message = "adminPwd must not exceed {max} characters")
	private String adminPwd;
    @NotNull(message = "adminStatus")
    @Size(min = 1, max = 2 ,message = "adminStatus must not exceed {max} characters")
	private String adminStatus;

}