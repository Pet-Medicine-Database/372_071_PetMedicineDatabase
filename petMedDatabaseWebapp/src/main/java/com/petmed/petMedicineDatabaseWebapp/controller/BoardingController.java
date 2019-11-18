package com.petmed.petMedicineDatabaseWebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boarding")
public class BoardingController {

	
	@RequestMapping("/list")
	public String listAnimals() {

		return "list-boarding";
	}
}
