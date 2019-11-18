package com.petmed.petMedicineDatabaseWebapp.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Boarding;
import com.petmed.petMedicineDatabaseWebapp.service.BoardingService;

@Controller
@RequestMapping("/boarding")
public class BoardingController {

	
	@Autowired
	private BoardingService boardingService;
	
	@RequestMapping("/list")
	public String listAnimals(Model theModel) {
		
		List<Boarding> boardingList = boardingService.getBoardings();
		
		theModel.addAttribute("boardings",boardingList);
	
		return "list-boarding";
		
	}
	
	@RequestMapping("/showBoardingFormForUpdate")
	public String showFormForUpdate(@RequestParam("boardingId") int theId, Model theModel) {
		
		Boarding theBoarding = boardingService.getBoarding(theId);
		
		theModel.addAttribute("boarding",theBoarding);
		
		return "boarding-form";
		
	}
	
	
	@GetMapping("/showBoardingFormForAdd")
	public String showBoardingFormForAdd(Model theModel) {
		
		Boarding theBoarding = new Boarding();
		
		LinkedHashMap<Animal, String> animalList = boardingService.getAnimalsAsKeyValuePair();
		
		theModel.addAttribute("boarding",theBoarding);
		theModel.addAttribute("animals",animalList);

		return "boarding-form";
	}
	
	
	@PostMapping("/saveBoarding")
	public String saveBoarding(@ModelAttribute("boarding") Boarding newBoarding){
		
		
		boardingService.saveBoarding(newBoarding);
		
		return "redirect:/boarding/list";
		
	}
		
}
