package controller;

import java.util.ArrayList;

import java.util.List;

import model.User;
import service.AdminService;


public class AdminController {
	
		
		User user = new User();
		List<User> userList = new ArrayList<User>();
		{
		try {
			
			//userList = adminService.viewUser();
		}catch(Exception e){
			
			e.printStackTrace();
		}
		model.addObject("user",user);
		model.addObject("userList", userList);
		
		return model;
		}

	/*@RequestMapping(value="/userForm", method=RequestMethod.POST)
	public String InsertUser(@ModelAttribute("user") TUser user){
		
		try{
			
			adminService.insertUser(user);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return "redirect:/main/userForm";
	}*/
	
		
		return "PasswordResetPage";
	}
	
}