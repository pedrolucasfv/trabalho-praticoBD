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

import com.campeonato.confederacao.model.Partida;
import com.campeonato.confederacao.service.PartidaService;

@RestController
@RequestMapping("/partida")
public class PartidaController {
	
	@Autowired
	PartidaService partidaService;

	@PostMapping
	public Partida cadastrar(@RequestBody Partida partida) {
		return partidaService.cadastrar(partida);
	}
	
	@PutMapping
	public String atualizar(@RequestBody Partida partida) {
		return partidaService.atualizar(partida);
	}
	
	@GetMapping
    public List<Partida> getCampeonatos(Partida partida) {
        return partidaService.listar();
    }
	
	 @DeleteMapping("/{estadio}")
	    public String deletar(@PathVariable String estadio) {
	        return partidaService.deletar(estadio);
	 }

}
