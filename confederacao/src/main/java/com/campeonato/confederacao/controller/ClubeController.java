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

import com.campeonato.confederacao.model.Clube;
import com.campeonato.confederacao.service.ClubeService;

@RestController
@RequestMapping("/clube")
public class ClubeController {
	
	@Autowired
	ClubeService clubeService;

	@PostMapping
	public Clube cadastrar(@RequestBody Clube clube) {
		return clubeService.cadastrar(clube);
	}
	
	@PutMapping
	public String atualizar(@RequestBody Clube clube) {
		return clubeService.atualizar(clube);
	}
	
	@GetMapping
    public List<Clube> getCampeonatos(Clube clube) {
        return clubeService.listar();
    }
	
	 @DeleteMapping("/{nome}")
	    public String deletar(@PathVariable String nome) {
	        return clubeService.deletar(nome);
	 }

}
