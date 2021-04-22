package com.campeonato.confederacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campeonato.confederacao.model.Clube;
import com.campeonato.confederacao.repository.ClubeRepository;

@Service
public class ClubeService {
	
	@Autowired
	ClubeRepository ClubeRepository;
	
	public Clube cadastrar(Clube clube) {
		return ClubeRepository.save(clube);
	}
	
	public List<Clube> listar() {
		return ClubeRepository.findAll();
	}
	
	public String atualizar(Clube dadosClube) {
		Clube clube = ClubeRepository.findByNome(dadosClube.getNome());
		if (clube != null) {
			clube.setPresidente(dadosClube.getPresidente());
			clube.setEndereco(dadosClube.getEndereco());
			clube.setCores(dadosClube.getCores());
			try {
				ClubeRepository.save(clube);
			}catch(Exception e) {
				return "Erro ao atualizar Clube.";
			}
			return "Clube atualizado com sucesso.";
		} else {
			return "Clube não encontrado.";
		}		
	}
	
	public String deletar(String nome) {
		Clube clube = ClubeRepository.findByNome(nome);
		try {
			ClubeRepository.delete(clube);
		}
		catch(Exception e) {
			return "Erro ao deletar Clube. Clube não encontrado.";
		}
		return "Clube deletado com sucesso";
	}

}
