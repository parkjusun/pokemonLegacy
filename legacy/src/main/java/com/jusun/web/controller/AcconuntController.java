package com.jusun.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
@RequestMapping("/user")
public class AcconuntController {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);
	@GetMapping("/join/form")
	public String joinForm() {
	logger.info("ȭ������");
		return "join";
	}
}
