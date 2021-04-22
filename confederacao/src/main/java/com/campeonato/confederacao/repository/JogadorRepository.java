package com.campeonato.confederacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campeonato.confederacao.model.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador,Long> {
	
	Jogador findByRegistro(int registro);

}
