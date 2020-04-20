package service;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.websocket.AuthenticationException;

import model.User;



public class LoginFailureHandlerService {

	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException authentication)
			throws IOException, ServletException {
		
		
		User user = UserService.getUserByLoginID(authentication.getCause());
		System.out.println("Login Failure Handler");
		
		response.sendRedirect("/PGHMS/auth/login?error_msg=" +authentication.getMessage());
		
		
	}
}
