package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {
//	@RequestMapping(value = "/calci", method = RequestMethod.GET)
//	public String calulate(HttpServletRequest request, Model model) {
//		String val1 = request.getParameter("value1");
//		String val2 = request.getParameter("value2");
//		String op = request.getParameter("optr");
//		Double v1 = 0.0;
//		Double v2 = 0.0;
//		double result = 0;
//
//		if(val1 != null && val2 != null) {
//			v1 = Double.parseDouble(val1);
//			v2 = Double.parseDouble(val2);
//		
//		if(op.equals("+")) {
//			result = v1 + v2;
//		} else if(op.equals("-")) {
//			result = v1 - v2;
//		} else if(op.equals("*")) {
//			result = v1 * v2;
//		} else if(op.equals("/")) {
//			result = v1 / v2;
//		} 
//		}
//		String res = val1 + " " + op + " " + val2 + " = " + result;
//		
//		model.addAttribute("result", res);
//		return "calculator";
//	}
	
	@RequestMapping(value = "/calci", method = RequestMethod.GET)
	public String calulate(	@RequestParam("value1")  String val1, 
							@RequestParam("value2")  String val2, 
							@RequestParam("optr")  String op, 
							Model model) {
		Double v1 = 0.0;
		Double v2 = 0.0;
		double result = 0;

		if(val1 != null && val2 != null) {
			v1 = Double.parseDouble(val1);
			v2 = Double.parseDouble(val2);
		
		if(op.equals("+")) {
			result = v1 + v2;
		} else if(op.equals("-")) {
			result = v1 - v2;
		} else if(op.equals("*")) {
			result = v1 * v2;
		} else if(op.equals("/")) {
			result = v1 / v2;
		} 
		}
		String res = val1 + " " + op + " " + val2 + " = " + result;
		
		model.addAttribute("result", res);
		return "calculator";
	}

}
