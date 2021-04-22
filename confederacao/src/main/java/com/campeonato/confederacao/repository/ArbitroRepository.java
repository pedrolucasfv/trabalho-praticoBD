package com.campeonato.confederacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campeonato.confederacao.model.Arbitro;

@Repository
public interface ArbitroRepository extends JpaRepository<Arbitro, Long> {
	
	Arbitro findByNome(String name);
}
