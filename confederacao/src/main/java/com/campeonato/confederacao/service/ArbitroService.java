package com.campeonato.confederacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campeonato.confederacao.model.Arbitro;
import com.campeonato.confederacao.repository.ArbitroRepository;

@Service
public class ArbitroService {
	
	@Autowired
	ArbitroRepository arbitroRepository;
	
	public Arbitro cadastrar(Arbitro arbitro) {
		return arbitroRepository.save(arbitro);
	}
	
	public List<Arbitro> listar() {
		return arbitroRepository.findAll();
	}
	
	public String atualizar(Arbitro dadosArbitro) {
		Arbitro arbitro = arbitroRepository.findByNome(dadosArbitro.getNome());
		if (arbitro != null) {
			arbitro.setFuncao(dadosArbitro.getFuncao());
			arbitro.setAnoFormacao(dadosArbitro.getAnoFormacao());
			try {
				arbitroRepository.save(arbitro);
			}catch(Exception e) {
				return "Erro ao atualizar Arbitro.";
			}
			return "Arbitro atualizado com sucesso.";
		} else {
			return "Arbitro não encontrado.";
		}		
	}
	
	public String deletar(String nome) {
		Arbitro arbitro = arbitroRepository.findByNome(nome);
		try {
			arbitroRepository.delete(arbitro);
		}
		catch(Exception e) {
			return "Erro ao deletar Arbitro. Arbitro não encontrado.";
		}
		return "Arbitro deletado com sucesso";
	}

}
