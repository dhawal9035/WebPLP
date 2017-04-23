package edu.asu.plp.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.asu.plp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/user")
	public Principal userLogin(Principal principal){
		return principal;
	}
	
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public void saveUser(@RequestParam (value="firstName") String firstName, @RequestParam (value="lastName") String lastName,
			 @RequestParam (value="email") String emailId){
		
		userService.saveUser(emailId, firstName, lastName);
	}
}
