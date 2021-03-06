package io.employee.controller;

import java.util.Map;

import io.paging.Paging;
import io.paging.bean.PagingBean;
import io.employee.bean.model.EmployeeModel;
import io.employee.bean.para.SelectUserPara;
import io.employee.bean.para.UserDetailPara;
import io.employee.bean.para.UserPara;
import io.employee.service.UserService;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController extends AbstractBaseController {

	final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private Validator validator;
	@Autowired
	private MessageSource message;
	@Autowired
    private UserService employeeService;

	@RequestMapping(value = {"/", "index"})
	public String index(ModelMap model) throws Exception {
		model.addAttribute("navi", "user");
		return "user/index";
	}

    /**
     * User Page
     * 
     * @param  ModelMap 
     *         model
     *
     * @throws  Exception
     *          If a error occur, ...
     *
     * @return String
     * 		   a file name of FTL.
     * 
     * @since  1.7
     */
	@RequestMapping(value = {"userList.do"})
	public String userList(@Valid UserPara userPara, ModelMap model) throws Exception {

		EmployeeModel employeeModel = new EmployeeModel();

		PagingBean paging = new PagingBean();
		// Set Paging list
		if(userPara.getAllCount() <= 0) {
			paging.setAllCount(employeeService.getEmployeeUserSum());
		} else {
			paging.setAllCount(userPara.getAllCount());
		}
		Paging.linkPaging(paging, userPara.getNowPage());
		employeeModel.setPaging(paging);

		// Execute the transaction
		// employeeModel.setEmployeeList(employeeService.selectemployeeList(userPara));

		model.addAttribute("model", employeeModel);

		return "employee/userList";
	}

    /**
     * Select some data from the Mysql.
     * 
     * @param  SelectUserPara 
     *         a user name
     * @param  BindingResult 
     *         bindingResult
     * @param  ModelMap 
     *         model
     * @param  HttpServletResponse 
     *         response
     *         
     * @throws  Exception
     *          If a error occur, ...
     *
     * @return String
     * 		   a file name of FTL.
     * 
     * @since  1.7
     */
	@RequestMapping(value = {"userDetail.do"})
	public String userDetail(@Valid UserDetailPara userDetailPara, BindingResult bindingResult, 
			ModelMap model, HttpServletResponse response) throws Exception {

		EmployeeModel employeeModel = new EmployeeModel();

		// Custom Validate
		new UserValidator().validate(userDetailPara, bindingResult);
		// If it occurs a error, set the default value.
		if (bindingResult.hasErrors()) {
			logger.error("userDetail.do - it is occured a parameter error.");
			Map<String, String> mapErrorMessage = this.handleErrorMessages(bindingResult.getAllErrors());
			response.setStatus(400);
			model.addAttribute("errorMessage", mapErrorMessage);
			return "employee/userList";
		}

		// Select name's data from User
		// employeeModel.setUserModel(employeeService.selectemployeeByName(userDetailPara.getUserName()));

		model.addAttribute("model", employeeModel);

		return "employee/userDetail";
	}

    /**
     * Select some data from the Mysql.
     * 
     * @param  SelectUserPara 
     *         a user name
     * @param  BindingResult 
     *         bindingResult
     * @param  ModelMap 
     *         model
     * @param  HttpServletResponse 
     *         response
     *         
     * @throws  Exception
     *          If a error occur, ...
     *
     * @return String
     * 		   a file name of FTL.
     * 
     * @since  1.7
     */
	@RequestMapping(value = {"selectUser.do"})
	public String selectUser(@Valid SelectUserPara selectUserPara, BindingResult bindingResult, 
			ModelMap model, HttpServletResponse response) throws Exception {

		EmployeeModel employeeModel = new EmployeeModel();

		// Custom Validate
		new UserValidator().validate(selectUserPara, bindingResult);

		// If it occurs a error, set the default value.
		if (bindingResult.hasErrors()) {
			logger.error("selectUser.do - it is occured a parameter error.");
			Map<String, String> mapErrorMessage = this.handleErrorMessages(bindingResult.getAllErrors());
			response.setStatus(400);
			model.addAttribute("errorMessage", mapErrorMessage);
			return "employee/userList";
		}

		// Execute the transaction
		// employeeModel.setEmployeeList(employeeService.selectemployeeByName(selectUserPara));

		model.addAttribute("model", employeeModel);

		return "employee/userDetail";
	}

}