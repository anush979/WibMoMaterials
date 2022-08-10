package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/test", method=RequestMethod.GET)
	public String welcome() {
		
		return "welcome";
	}
	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String home() {
		return "homepage";
	}

	@RequestMapping(value = "/greetinginput", method=RequestMethod.GET)
	public String greetingInput() {
		return "greetinginput";
	}
	
	
	@RequestMapping(value = "/greeting", method=RequestMethod.GET)
	public String greetings(HttpServletRequest request, Model model) {
		String userName = request.getParameter("user");
		String message = "to WibMo " + userName;
		
		model.addAttribute("userMessage", message);
		
		return "greeting";
	}
}
