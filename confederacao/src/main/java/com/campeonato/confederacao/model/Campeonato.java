package com.campeonato.confederacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "campeonato")
public class Campeonato {
	
	@Id
	private String nome;
	private int premiacao;
	@Column(name="data_de_inicio")
	private String dataInicio;
	private int duracaomeses;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPremiacao() {
		return premiacao;
	}
	public void setPremiacao(int premiacao) {
		this.premiacao = premiacao;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public int getDuracaomeses() {
		return duracaomeses;
	}
	public void setDuracaomeses(int duracaomeses) {
		this.duracaomeses = duracaomeses;
	}

}
