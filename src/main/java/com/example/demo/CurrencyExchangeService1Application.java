package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class CurrencyExchangeService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeService1Application.class, args);
	}
	
	@RequestMapping(path="/hello")
	@ResponseBody
	public String hello() {
		return "Hello";
	}

}
