package com.campeonato.confederacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campeonato.confederacao.model.Jogador;
import com.campeonato.confederacao.repository.JogadorRepository;

@Service
public class JogadorService {
	@Autowired
	JogadorRepository jogadorRepository;
	
	public Jogador cadastrar(Jogador jogador) {
		return jogadorRepository.save(jogador);
	}
	
	public List<Jogador> listar() {
		return jogadorRepository.findAll();
	}
	
	public String atualizar(Jogador dadosJogador) {
		Jogador jogador = jogadorRepository.findByRegistro(dadosJogador.getRegistro());
		if (jogador != null) {
			jogador.setCartaoAmarelo(dadosJogador.getCartaoAmarelo());
			jogador.setCartaoAmarelo(dadosJogador.getCartaoVermelho());
			jogador.setDataNascimento(dadosJogador.getDataNascimento());
			jogador.setGols(dadosJogador.getGols());
			jogador.setPosicaoArtilharia(dadosJogador.getPosicaoArtilharia());
			jogador.setClube(dadosJogador.getClube());
			try {
				jogadorRepository.save(jogador);
			}catch(Exception e) {
				return "Erro ao atualizar Jogador.";
			}
			return "Jogador atualizado com sucesso.";
		} else {
			return "Jogador não encontrado.";
		}		
	}
	
	public String deletar(int registro) {
		Jogador jogador = jogadorRepository.findByRegistro(registro);
		try {
			jogadorRepository.delete(jogador);
		}
		catch(Exception e) {
			return "Erro ao deletar Jogador. Jogador não encontrado.";
		}
		return "Jogador deletado com sucesso";
	}
}
