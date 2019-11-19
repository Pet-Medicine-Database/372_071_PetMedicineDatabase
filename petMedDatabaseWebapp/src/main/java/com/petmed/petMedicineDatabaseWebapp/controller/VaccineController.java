package com.petmed.petMedicineDatabaseWebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.petmed.petMedicineDatabaseWebapp.entity.Vaccine;
import com.petmed.petMedicineDatabaseWebapp.service.VaccineService;

@Controller
@RequestMapping("/vaccine")
public class VaccineController {
	
	@Autowired
	private VaccineService vaccineService; 
	
	@RequestMapping("/list")
	public String listAnimals(Model theModel) {
		List<Vaccine> vaccineList = vaccineService.getVaccines();
		
		theModel.addAttribute(vaccineList);
		
		return "list-vaccine";
	}
	
	@GetMapping("/showVaccineFormForAdd")
	public String showVaccineFormForAdd(Model theModel) {
		Vaccine theVaccine = new Vaccine();
		
		theModel.addAttribute("vaccine",theVaccine);
		
		return "vaccineForm";
		
	}
	
	@PostMapping("/saveVaccine")
	public String saveVaccine(@ModelAttribute("vaccine") Vaccine newVaccine) {
		vaccineService.saveVaccine(newVaccine);
		
		return "redireck:/vaccine/list";
	}
	
	@GetMapping("/showVaccineFormForUpdate")
	public String showVaccineFormForUpdate(@RequestParam("vaccineId") int theId, Model theModel) {
		
		Vaccine theVaccine = vaccineService.getVaccine(theId);
		
		theModel.addAttribute(theVaccine);
		
		return "vaccine-form";
	}
	

}
