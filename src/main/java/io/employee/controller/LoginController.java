package io.employee.controller;

import io.employee.bean.model.EmployeeModel;
import io.employee.bean.para.RegisterAdminPara;
import io.employee.bean.para.UserPara;
import io.employee.bean.para.login.RegisterPwdPara;
import io.employee.bean.para.login.SignUpPara;
import io.employee.service.LoginService;
import io.employee.service.UserService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

/***
 * The <code>LoginemployeeController</code> class represents action controller.
 * 
 * @adminor  Woong-joon Kim
 * @version 0.1, 14/07/15
 * @see     io.employee.controller.LoginController#login()
 * @see     io.employee.controller.LoginController#logout()
 * @see     io.employee.controller.LoginController#denied()
 * 
 * @since   JDK1.7
 */
@Controller
@RequestMapping("/login")
public class LoginController extends AbstractBaseController {

	final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private Validator validator;
	@Autowired
	private MessageSource message;
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = {"index"})
	public String index(ModelMap model) throws Exception {

		logger.info("this is login.do");

		return "login/index";
	}

	@RequestMapping(value = {"singup"})
	public String singup(@RequestParam(value="error", required=false) boolean error, ModelMap model, HttpSession session) throws Exception {

		logger.info("this is login.do");

		if (error == true) {
			model.put("error", "You have entered an invalid username or password!");
		} else {
			model.put("error", "");
		}

		return "login/login";
	}

	@RequestMapping(value = {"sendEmail"})
	public String sendEmail(@Valid SignUpPara signUpPara, HttpSession session) throws Exception {

		logger.info("this is login.do");

		loginService.registerUserTemp(signUpPara);

		return "login/sentEmail";
	}

	@RequestMapping(value = {"confirmSingup"})
	public String confirmSingup(@RequestParam("token") String token, HttpSession session) throws Exception {

		logger.info("token = " + token);
		loginService.checkToken(token);

		return "login/confirmSingup";
	}

	@RequestMapping(value = {"registerPwd"})
	public String registerPwd(@Valid RegisterPwdPara registerPwdPara, HttpSession session) throws Exception {

		loginService.insertUser(registerPwdPara);

		return "login/confirmSingup";
	}

	@RequestMapping(value = {"logout"})
	public String logout(ModelMap model, SessionStatus sessionStatus) throws Exception {

		EmployeeModel hadoopModel = new EmployeeModel();
		hadoopModel.setNavi("login");

		// Clear data in the session.
		sessionStatus.isComplete();

		model.addAttribute("model", hadoopModel);

		return "redirect:/employee/index/";
	}

	@RequestMapping(value = {"denied"})
	public String denied(ModelMap model, HttpSession session) throws Exception {

		logger.info("it is denied");
		return "login/denied";
	}

}