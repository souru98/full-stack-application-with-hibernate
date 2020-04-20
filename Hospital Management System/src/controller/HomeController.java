package controller;


public class HomeController {
		
	
	public String home(){
		//System.out.println("This is from HomeController.");
		return "redirect:/auth/login";
	}
}