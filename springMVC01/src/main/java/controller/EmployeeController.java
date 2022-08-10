package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Employee;
import service.EmployeeService;

@Controller
public class EmployeeController {
	EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET )
	public String login() {
		return "login";
	}
	

	
	@RequestMapping(value = "/loginsubmit", method = RequestMethod.POST )
	public String loginsubmit(HttpServletRequest request, Model model) {
		String userName = request.getParameter("user");
		String password = request.getParameter("password");
		Employee e = employeeService.login(userName, password);
		System.out.println("user : " + userName);
		System.out.println("password : " + password);
		
		if(e != null) {
			model.addAttribute("employee", e);
			return "employeehome";
		}
		String errorMessage = "<h1 style={color='red'}>Login Fail !!!!!!!<h1>";
		model.addAttribute("loginfail", errorMessage);
		return "login";
	}
}
