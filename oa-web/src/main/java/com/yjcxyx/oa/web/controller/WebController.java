package com.yjcxyx.oa.web.controller;

import com.yjcxyx.oa.auth.model.Authorization;
import com.yjcxyx.oa.auth.service.AuthorizationService;
import com.yjcxyx.oa.flow.model.Application;
import com.yjcxyx.oa.flow.service.ApplicationService;
import com.yjcxyx.oa.organ.model.Employee;
import com.yjcxyx.oa.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private AuthorizationService authorizationService;
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping("/addEmployee")
	@ResponseBody
	public String addEmployee(Employee employee) {
		try {
			employeeService.addEmployee(employee);
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "ok";
	}
	
	@RequestMapping("/authorize")
	@ResponseBody
	public String authorize(Authorization auth) {
		try {
			authorizationService.authorize(auth); 
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "ok";
	}
	
	@RequestMapping("/createApplication")
	@ResponseBody
	public String createApplication(Application app) {
		try {
			applicationService.create(app);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "ok";
	}
	
}
