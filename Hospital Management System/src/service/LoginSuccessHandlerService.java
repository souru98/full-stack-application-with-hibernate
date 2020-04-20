package service;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;



public class LoginSuccessHandlerService {

	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {

		Set<String> roles = ;


		if (roles.contains("ROLE_ADMIN")) {
			response.sendRedirect("/dailyAccountOfOperationSection");
			return;
		}

	}

}
