package com.campeonato.confederacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campeonato.confederacao.model.Clube;

@Repository
public interface ClubeRepository extends JpaRepository<Clube, Long> {
	
	Clube findByNome(String name);
}
