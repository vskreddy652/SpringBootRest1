package com.sprst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

@RestController
class AbcRest{
	@RequestMapping("/")
	public String met()
	{
		return "This is onlyyyy toooooo Testtttttttttt";
	}
}
