package org.ashok.oauthclient;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@SpringBootApplication
public class OauthClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthClientApplication.class, args);
	}
	
	@GetMapping("/")
	Map<String,String> hello(Authentication authentication) {
		return Map.of("message", "Hello, " + authentication.getName());
	}

}
