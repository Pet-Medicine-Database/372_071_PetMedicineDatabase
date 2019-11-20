package com.petmed.petMedicineDatabaseWebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
