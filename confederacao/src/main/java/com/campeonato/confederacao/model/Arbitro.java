package com.campeonato.confederacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arbitro")
public class Arbitro {
	@Id
	private String nome;
	@Column(name="anoformacao")
	private String anoFormacao;
	private String funcao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnoFormacao() {
		return anoFormacao;
	}
	public void setAnoFormacao(String anoFormacao) {
		this.anoFormacao = anoFormacao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
