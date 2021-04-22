package com.campeonato.confederacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partida")
public class Partida {
	@Id
	private String estadio;
	
	@Column(name="pdata")
	private String pData;
	
	@ManyToOne
	@JoinColumn(name = "mandante", referencedColumnName = "nome")
	private Clube clubeMandante;
	@ManyToOne
	@JoinColumn(name = "visitante", referencedColumnName = "nome")
	private Clube clubeVisitante;
	@ManyToOne
	@JoinColumn(name = "nomearbitro", referencedColumnName = "nome")
	private Arbitro arbitro;
	
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public String getpData() {
		return pData;
	}
	public void setpData(String pData) {
		this.pData = pData;
	}
	public Clube getClubeMandante() {
		return clubeMandante;
	}
	public void setClubeMandante(Clube clubeMandante) {
		this.clubeMandante = clubeMandante;
	}
	public Clube getClubeVisitante() {
		return clubeVisitante;
	}
	public void setClubeVisitante(Clube clubeVisitante) {
		this.clubeVisitante = clubeVisitante;
	}
	public Arbitro getArbitro() {
		return arbitro;
	}
	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}


}
