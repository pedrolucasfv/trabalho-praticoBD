package com.campeonato.confederacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "jogador")
public class Jogador {
	@Id
	private int registro;
	private String nome;
	private int gols;
	@Column(name="cartao_vermelho")
	private int cartaoVermelho;
	@Column(name="cartao_amarelo")
	private int cartaoAmarelo;
	@Column(name="data_nascimento")
	private String dataNascimento;
	@Column(name="posicao_artilharia")
	private int posicaoArtilharia;
	@ManyToOne
	@JoinColumn(name = "cnome", referencedColumnName = "nome")
	private Clube clube;
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	public int getCartaoVermelho() {
		return cartaoVermelho;
	}
	public void setCartaoVermelho(int cartaoVermelho) {
		this.cartaoVermelho = cartaoVermelho;
	}
	public int getCartaoAmarelo() {
		return cartaoAmarelo;
	}
	public void setCartaoAmarelo(int cartaoAmarelo) {
		this.cartaoAmarelo = cartaoAmarelo;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getPosicaoArtilharia() {
		return posicaoArtilharia;
	}
	public void setPosicaoArtilharia(int posicaoArtilharia) {
		this.posicaoArtilharia = posicaoArtilharia;
	}
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	


}
