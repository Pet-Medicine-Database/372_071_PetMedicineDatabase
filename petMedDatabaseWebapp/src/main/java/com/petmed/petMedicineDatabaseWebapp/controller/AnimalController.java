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

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.service.AnimalService;

@Controller
@RequestMapping("/animal")
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;

	@RequestMapping("/list")
	public String listAnimals(Model theModel) {

		//get animals from service. Service must be provided.
		List<Animal> theAnimals = animalService.getAnimals();
		
		theModel.addAttribute("animals",theAnimals);
		
		return "list-animals";
	}
	
	@RequestMapping("/showAnimal")
	public String showAnimal(@RequestParam("animalId") int theId, Model theModel)
	{
		//get the animal with an id @param theId. Service must be provided.
		Animal theAnimal = animalService.getAnimal(theId);
		
		//add the animal to the model
		theModel.addAttribute("animal",theAnimal);
		
		//show-animal.jsp page should show the animal.
		return "show-animal";
	}
	
	@GetMapping("/showAnimalFormForAdd")
	public String showAnimalFormForAdd(Model theModel) {
		
		//when constructing an animal vetList must be prepopulated. Because we should provide a vet list to a user to choose from.
		//By that 
		
		  Animal theAnimal = new Animal();
		  
		  theModel.addAttribute("animal",theAnimal);
		 
		
		return "animal-form";
	}
	
	
	@PostMapping("/saveAnimal")
	public String saveAnimal(@ModelAttribute("animal") Animal newAnimal) {
		
		//Save the sent animal to the DB. Service must be provided.
		//animalService.saveAnimal(newAnimal);		
		System.out.println(newAnimal);
		//redirect user to the animal list. Let him see the new animal is added.
		//TUNA: Animal eklendi diye bir not basabiliriz bak.
		return "redirect:/animal/list";
	}
	
	@GetMapping("/showAnimalFormForUpdate")
	public String showAnimalForUpdate(@RequestParam("animalId") int theId, Model theModel) {
		
		//get the animal with an id @param theId. Service must be provided.
		Animal theAnimal = animalService.getAnimal(theId);
		
		
		//add that very animal to the model to pre-populate the form.
		theModel.addAttribute("animal",theAnimal);
		
		//send over to the form.
		return "animal-form";
	}
	
	
	
	
	
}
