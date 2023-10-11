package org.ashok.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class AuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServerApplication.class, args);
	}
	
	@Bean
	UserDetailsService userDetails() {
		
		UserBuilder builder = User.builder();
		return new InMemoryUserDetailsManager(
				builder.roles("USER").username("ashok").password("{noop}password").build(),
				builder.roles("USER, ADMIN").username("admin").password("{noop}password").build()
				);
		
	}

}
