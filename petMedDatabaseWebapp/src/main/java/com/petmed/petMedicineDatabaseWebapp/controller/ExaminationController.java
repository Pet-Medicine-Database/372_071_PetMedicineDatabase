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
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;
import com.petmed.petMedicineDatabaseWebapp.entity.Examination;
import com.petmed.petMedicineDatabaseWebapp.service.ExaminationService;

@Controller
@RequestMapping("/examination")
public class ExaminationController {
	
	@Autowired
	private ExaminationService examinationService;
	
	@RequestMapping("/list")
	public String listExaminations(Model theModel) {

		//get examinations from service. Service must be provided.
		List<Examination> theExaminations = examinationService.getExaminations();
		theModel.addAttribute("examinations",theExaminations);
		
		return "list-examinations";
	}
	
	@RequestMapping("/showExamination")
	public String showExamination(@RequestParam("appointmentId") int theId, Model theModel)
	{
		//get the animal with an id @param theId. Service must be provided.
		Examination theExamination = examinationService.getExamination(theId);
	
		//add the animal to the model
		theModel.addAttribute("examination",theExamination);
		
		//show-animal.jsp page should show the animal.
		return "show-examination";
	}

	@GetMapping("/showExaminationFormForAdd")
	public String showExaminationFormForAdd(Model theModel) {
		
		//when constructing an examination vetList must be prepopulated. Because we should provide a vet list to a user to choose from.
		//By that 

		  Examination theExamination = new Examination();
		  //string hold the value of corresponding vet
		  LinkedHashMap<Vet, String> vetList = examinationService.getVetsAsKeyValuePair();
		  
	 	  //string hold the value of corresponding animal
		  LinkedHashMap<animal, String> animalList = examinationService.getAnimalsAsKeyValuePair();
		  	  
		  theModel.addAttribute("examination",theExamination);
		  theModel.addAttribute("animals",animalList);
		  theModel.addAttribute("vets",vetList);
		 
		
		return "examination-form";
	}
	
	
	@PostMapping("/saveExamination")
	public String saveExamination(@ModelAttribute("examination") Examination newExamination) {
		System.out.println("I m here");
		//Save the sent animal to the DB. Service must be provided.
		examinationService.saveExamination(newExamination);		
		System.out.println(newExamination);
		//redirect user to the animal list. Let him see the new animal is added.
		return "redirect:/examination/list";
	}
	
	@GetMapping("/showExaminationFormForUpdate")
	public String showExaminationFormForUpdate(@RequestParam("appointmentId") int theId, Model theModel) {
		
		//get the animal with an id @param theId. Service must be provided.
		Examination theExamination = examinationService.getExamination(theId);
		
		
		//add that very animal to the model to pre-populate the form.
		theModel.addAttribute("examination",theExamination);
		
		//send over to the form.
		return "examination-form";
	}
	

}
