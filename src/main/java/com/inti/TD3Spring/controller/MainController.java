package com.inti.TD3Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.TD3Spring.model.Acteur;
import com.inti.TD3Spring.model.Utilisateur;
import com.inti.TD3Spring.repository.IActeurRepository;
import com.inti.TD3Spring.repository.IUtilisateurRepository;

@Controller
public class MainController {
	
	@Autowired
	IActeurRepository iar;
	
	@Autowired
	IUtilisateurRepository iur;
	
	@GetMapping("formActeur")
	public String formActeur()
	{
		System.out.println("liste nom : " + iar.findByNom("Jean"));
		
		System.out.println("prénom et email : " + iar.findByPrenomAndEmail("Jacques", "toto@toto.fr"));
		
		System.out.println("ville : " + iar.trouverParVille("Paris"));
		
		iar.updateNom(5, "Sophie");
		
		System.out.println("Nombre : " + iar.getActorCount());
		System.out.println("Nombre : " + iar.count());
		
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
	
	@GetMapping("connexion")
	public String connexion(@RequestParam(name = "error", required = false, defaultValue = "0") int e, Model m)
	{
		m.addAttribute("err", e);
		
		return "connexion";
	}
	
	@GetMapping("inscription")
	public String inscription()
	{
		return "inscription";
	}
	
	@PostMapping("saveUser")
	public String saveUser(@ModelAttribute("utilisateur") Utilisateur u)
	{
		u.setMdp(String.valueOf(u.hashCode()));
		
		iur.save(u);
		
		return "redirect:/connexion";
	}
	
	@PostMapping("verifierUser")
	public String verifierUser(@ModelAttribute("utilisateur") Utilisateur u)
	{
		u.setMdp(String.valueOf(u.hashCode()));
		
		if(iur.findByLoginAndMdp(u.getLogin(), u.getMdp()) != null)
		{
			return "redirect:/listeActeur";
		}
		
		return "redirect:/connexion?error=1";
		
	}

}
