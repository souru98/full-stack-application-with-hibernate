package controller;





public class LoginLogoutController {

	
	public String showLoginPage((value="error_msg", required=false) String error, Model model){
		//System.out.println("Error Message: " + error);
		//System.out.println("Entered LoginLogout Controller");
		if (error!=null) {
			model.addAttribute("error", "Wrong User Name or Password!");
		} else {
			model.addAttribute("error", "");
		}
		
		return "Login";			
	}
	
	
 	public String getDeniedPage() {
		return "redirect:/auth/login";
	}
	
	public String logout() {
		
		return "redirect:/auth/login";
	}

}
