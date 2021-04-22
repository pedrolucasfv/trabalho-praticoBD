package com.campeonato.confederacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campeonato.confederacao.model.Campeonato;
import com.campeonato.confederacao.repository.CampeonatoRepository;

@Service
public class CampeonatoService {
	
	@Autowired
	CampeonatoRepository campeonatoRepository;
	
	public Campeonato cadastrar(Campeonato campeonato) {
		return campeonatoRepository.save(campeonato);
	}
	
	public List<Campeonato> listar() {
		return campeonatoRepository.findAll();
	}
	
	public String atualizar(Campeonato dadosCampeonato) {
		Campeonato campeonato = campeonatoRepository.findByNome(dadosCampeonato.getNome());
		if (campeonato != null) {
			campeonato.setDataInicio(dadosCampeonato.getDataInicio());
			campeonato.setDuracaomeses(dadosCampeonato.getDuracaomeses());
			campeonato.setPremiacao(dadosCampeonato.getPremiacao());
			try {
				campeonatoRepository.save(campeonato);
			}catch(Exception e) {
				return "Erro ao atualizar campeonato.";
			}
			return "Campeonato atualizado com sucesso.";
		} else {
			return "Campeonato não encontrado.";
		}
		
		
	}
	
	public String deletar(String nome) {
		Campeonato campeonato = campeonatoRepository.findByNome(nome);
		try {
			campeonatoRepository.delete(campeonato);
		}
		catch(Exception e) {
			return "Erro ao deletar campeonato. Campeonato não encontrado.";
		}
		return "Campeonato deletado com sucesso";
	}
}
