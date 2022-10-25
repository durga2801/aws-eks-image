package com.durgendra;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eks")
public class EksController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to EKS Test, Docker version 0.0.9";
	}

}