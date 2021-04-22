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

import com.campeonato.confederacao.model.Arbitro;
import com.campeonato.confederacao.service.ArbitroService;

@RestController
@RequestMapping("/arbitro")
public class ArbitroController {
	@Autowired
	ArbitroService arbitroService;

	@PostMapping
	public Arbitro cadastrar(@RequestBody Arbitro arbitro) {
		return arbitroService.cadastrar(arbitro);
	}
	
	@PutMapping
	public String atualizar(@RequestBody Arbitro arbitro) {
		return arbitroService.atualizar(arbitro);
	}
	
	@GetMapping
    public List<Arbitro> getCampeonatos(Arbitro arbitro) {
        return arbitroService.listar();
    }
	
	 @DeleteMapping("/{nome}")
	    public String deletar(@PathVariable String nome) {
	        return arbitroService.deletar(nome);
	 }
}
