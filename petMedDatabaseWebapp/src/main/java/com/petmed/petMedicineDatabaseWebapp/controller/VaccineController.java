package com.petmed.petMedicineDatabaseWebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vaccine")
public class VaccineController {
	
	@RequestMapping("/list")
	public String listAnimals() {

		System.out.println("I m here");
		return "list-vaccine";
	}

}