package com.inti.TD3Spring.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.TD3Spring.model.Acteur;

@Repository
@Transactional
public interface IActeurRepository extends JpaRepository<Acteur, Long> {
	
	// select * from acteur where nom = ?;
	List<Acteur> findByNom(String nom);
	
	// select * from acteur where prenom = ? and email = ?;
	Acteur findByPrenomAndEmail(String prenom, String email);
	
	@Query(value = "select * from acteur a where a.ville=:ville", nativeQuery = true)
	List<Acteur> trouverParVille(@Param("ville") String ville);
	
	@Modifying
	@Query(value = "UPDATE Acteur a SET a.nom=:nom WHERE a.id=:id", nativeQuery = true, countQuery = "select count(*) from acteur where id=:id")
	void updateNom(@Param("id") int id, @Param("nom") String nom);
	
	@Query(value = "select count(*) from acteur", nativeQuery = true, countQuery = "select count(*) from acteur")
	int getActorCount();

}
