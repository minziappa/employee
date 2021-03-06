package io.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import io.employee.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController extends AbstractBaseController {

	final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private Validator validator;
	@Autowired
	private MessageSource message;
	@Autowired
    private UserService employeeService;

    /**
     * Admin Index
     * 
     * @param  model 
     * @throws  Exception If a error occur, ...
     * @return String a file name of FTL.
     * @since  0.1
     * 
     */
	@RequestMapping(value = {"/", "index"})
	public String index(ModelMap model) throws Exception {
		model.addAttribute("navi", "admin");
		return "admin/index";
	}

    /**
     * Insert some data into the Mysql.
     * 
     * @param  employeePara 
     *         employeePara
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
	@RequestMapping(value = {"inputAdmin"})
	public String inputAdmin() throws Exception {
		return "admin/inputAdmin";
	}

//	@RequestMapping(value = {"inputAdmin"})
//	public String registerAdmin(@Valid RegisterAdminPara registerAdminPara, 
//			BindingResult bindingResult, ModelMap model, 
//			HttpServletResponse response) throws Exception {
//
//		EmployeeModel employeeModel = new EmployeeModel();
//
//		// If it occurs a error, set the default value.
//		if (bindingResult.hasErrors()) {
//			logger.error("insertUser.sp - it is occured a parameter error.");
//			response.setStatus(400);
//
//			Map<String, String> mapErrorMessage = this.handleErrorMessages(bindingResult.getAllErrors());
//			model.addAttribute("errorMessage",  mapErrorMessage);
//			model.addAttribute("model", employeeModel);
//			return "admin/register";
//		}
//
////		// Execute the transaction
////		if(!employeeService.insertemployee(insertUserPara)) {
////			model.addAttribute("errorMessage", message.getMessage("employee.parameter.error.message", null, LOCALE));
////			model.addAttribute("model", employeeModel);
////			return "employee/admin";
////		}
//
//		return "redirect:/employee/user/user.do";
//	}

}