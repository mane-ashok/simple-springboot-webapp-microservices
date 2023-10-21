package org.ashok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class InvoiceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceServiceApplication.class, args);
	}

}

@RestController
class InvocieController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello from Invoce Service";
	}
	
}