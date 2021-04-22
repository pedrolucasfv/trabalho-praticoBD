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

import com.campeonato.confederacao.model.Campeonato;
import com.campeonato.confederacao.service.CampeonatoService;

@RestController
@RequestMapping(value="/campeonato")
public class CampeonatoController {
	
	@Autowired
	CampeonatoService campeonatoService;
	
	@PostMapping
	public Campeonato cadastrar(@RequestBody Campeonato campeonato) {
		return campeonatoService.cadastrar(campeonato);
	}
	
	@PutMapping
	public String atualizar(@RequestBody Campeonato campeonato) {
		return campeonatoService.atualizar(campeonato);
	}
	
	@GetMapping
    public List<Campeonato> getCampeonatos(Campeonato campeonato) {
		return campeonatoService.listar();
         
    }
	
	 @DeleteMapping("/{nome}")
	    public String deletar(@PathVariable String nome) {
	        return campeonatoService.deletar(nome);
	 }
}
