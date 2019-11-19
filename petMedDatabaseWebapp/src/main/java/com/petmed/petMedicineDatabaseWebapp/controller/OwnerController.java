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

import com.petmed.petMedicineDatabaseWebapp.entity.Owner;
import com.petmed.petMedicineDatabaseWebapp.service.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {

	@Autowired
	private OwnerService ownerService;
	
	@RequestMapping("/list")
	public String listOwners(Model theModel) {
		List<Owner> ownerList = ownerService.getOwners(); 
		
		theModel.addAttribute(ownerList);
		
		return "list-owners";
	}
	
	@GetMapping("/showOwnerFormForAdd")
	public String showOwnerFormForAdd(Model theModel){
		Owner theOwner = new Owner();
		
		theModel.addAttribute("owner",theOwner);
		
		return "owner-form";
		
	}
	
	@PostMapping("/saveOwner")
	public String saveOwner(@ModelAttribute("owner") Owner newOwner) {
		ownerService.saveOwner(newOwner);
		
		return "redirect:/owner/list";
		
	}
	
	@GetMapping("showOwnerFormForUpdate")
	public String showOwnerFormForUpdate(@RequestParam("ownerId") int theId, Model theModel)
	{
		Owner theOwner = ownerService.getOwner(theId);
		
		theModel.addAttribute(theOwner);
		
		return "owner-form";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
