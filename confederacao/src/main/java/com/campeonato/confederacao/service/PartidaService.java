package com.campeonato.confederacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campeonato.confederacao.model.Partida;
import com.campeonato.confederacao.repository.PartidaRepository;

@Service
public class PartidaService {
	@Autowired
	PartidaRepository partidaRepository;
	
	public Partida cadastrar(Partida partida) {
		Partida partidaCadastrada = partidaRepository.save(partida);
		return partidaCadastrada;
	}
	
	public List<Partida> listar() {
		return partidaRepository.findAll();
	}
	
	public String atualizar(Partida dadosPartida) {
		Partida partida = partidaRepository.findByEstadio(dadosPartida.getEstadio());
		if (partida != null) {
			partida.setpData(dadosPartida.getpData());
			partida.setClubeMandante(dadosPartida.getClubeMandante());
			partida.setClubeVisitante(dadosPartida.getClubeVisitante());
			partida.setArbitro(dadosPartida.getArbitro());
			try {
				partidaRepository.save(partida);
			}catch(Exception e) {
				return "Erro ao atualizar Partida.";
			}
			return "Partida atualizado com sucesso.";
		} else {
			return "Partida não encontrado.";
		}		
	}
	
	public String deletar(String estadio) {
		Partida partida = partidaRepository.findByEstadio(estadio);
		try {
			partidaRepository.delete(partida);
		}
		catch(Exception e) {
			return "Erro ao deletar Partida. Partida não encontrado.";
		}
		return "Partida deletado com sucesso";
	}
}
