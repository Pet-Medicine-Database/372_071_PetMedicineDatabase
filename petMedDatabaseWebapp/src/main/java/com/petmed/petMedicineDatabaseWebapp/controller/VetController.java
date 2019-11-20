package com.petmed.petMedicineDatabaseWebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;
import com.petmed.petMedicineDatabaseWebapp.service.VetService;

@Controller
@RequestMapping("/vet")
public class VetController {
	
	@Autowired
	private VetService vetService; 
	
	@RequestMapping("/list")
	public String listVets(Model theModel) {
		List<Vet> vetList = vetService.getVets();
		
		theModel.addAttribute(vetList);
		
		return "list-vet";
	}
	
	@GetMapping("/showVetFormForAdd")
	public String showVetFormForAdd(Model theModel) {
		Vet theVet = new Vet();
		
		theModel.addAttribute("vet",theVet);
		
		return "vetForm";
		
	}
	
	@PostMapping("/saveVet")
	public String saveVet(@ModelAttribute("vet") Vet newVet) {
		vetService.saveVet(newVet);
		
		return "redirect:/vet/list";
	}
	
	@GetMapping("/showVetFormForUpdate")
	public String showVetFormForUpdate(@RequestParam("vetTCNo") int theId, Model theModel) {
		
		Vet theVet = vetService.getVet(theId);
		
		theModel.addAttribute(theVet);
		
		return "vet-form";
	}
}
