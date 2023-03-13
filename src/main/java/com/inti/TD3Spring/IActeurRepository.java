package com.inti.TD3Spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.TD3Spring.model.Acteur;

@Repository
public interface IActeurRepository extends JpaRepository<Acteur, Long> {

}
