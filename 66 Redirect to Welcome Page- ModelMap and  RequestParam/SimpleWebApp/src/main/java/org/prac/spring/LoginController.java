package org.prac.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.swing.internal.plaf.metal.resources.metal_ja;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLoginRequest(@RequestParam("name") String name, @RequestParam("password") String pwd, ModelMap model) {
		model.put("name", name);
		model.put("password",pwd);
		return "welcome";
	}
}
