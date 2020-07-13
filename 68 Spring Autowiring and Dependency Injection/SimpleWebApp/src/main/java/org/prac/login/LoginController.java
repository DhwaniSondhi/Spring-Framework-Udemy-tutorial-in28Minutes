package org.prac.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLoginRequest(@RequestParam("name") String name, @RequestParam("password") String pwd, ModelMap model) {
		boolean result=loginService.isUserValid(name, pwd);
		if(!result) {
			model.put("errorMsg", "Wrong Validation!");
			return "login";
		}
		model.put("name", name);
		model.put("password",pwd);
		return "welcome";
	}
}
