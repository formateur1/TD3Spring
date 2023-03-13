package com.inti.TD3Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.inti.TD3Spring.IActeurRepository;
import com.inti.TD3Spring.model.Acteur;

@Controller
public class MainController {
	
	@Autowired
	IActeurRepository iar;
	
	@GetMapping("formActeur")
	public String formActeur()
	{
		return "formActeur";
	}
	
	@PostMapping("saveActeur")
	public String saveActeur(@ModelAttribute("acteur") Acteur a)
	{
		iar.save(a);
		
		return "redirect:/listeActeur";
	}
	
	@GetMapping("listeActeur")
	public String listeActeur(Model m)
	{
		m.addAttribute("listeA", iar.findAll());
		
		return "listeActeur";
	}
	
	@GetMapping("deleteActeur/{id}")
	public String deleteActeur(@PathVariable("id") long id)
	{
		iar.deleteById(id);
		
		return "redirect:/listeActeur";
	}

}
