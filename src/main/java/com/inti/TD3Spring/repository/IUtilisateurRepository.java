package com.inti.TD3Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.TD3Spring.model.Utilisateur;

@Repository
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	
	Utilisateur findByLoginAndMdp(String login, String mdp);
}
