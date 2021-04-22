package com.campeonato.confederacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campeonato.confederacao.model.Jogador;
import com.campeonato.confederacao.service.JogadorService;

@RestController
@RequestMapping("/jogador")
public class JogadorController {
	@Autowired
	JogadorService jogadorService;

	@PostMapping
	public Jogador cadastrar(@RequestBody Jogador jogador) {
		return jogadorService.cadastrar(jogador);
	}
	
	@PutMapping
	public String atualizar(@RequestBody Jogador jogador) {
		return jogadorService.atualizar(jogador);
	}
	
	@GetMapping
    public List<Jogador> getCampeonatos(Jogador jogador) {
        return jogadorService.listar();
    }
	
	 @DeleteMapping("/{registro}")
	    public String deletar(@PathVariable int registro) {
	        return jogadorService.deletar(registro);
	 }
}
