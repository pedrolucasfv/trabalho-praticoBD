package com.campeonato.confederacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campeonato.confederacao.model.Partida;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long>{
	
	Partida findByEstadio(String estadio);

}
