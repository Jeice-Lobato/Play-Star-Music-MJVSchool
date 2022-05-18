package com.mjv.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "tb_genero_musical")
public class GeneroMusical {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome_genero_musical")
	private String nomeGeneroMusical;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeGeneroMusical() {
		return nomeGeneroMusical;
	}

	public void setNomeGeneroMusical(String nomeGeneroMusical) {
		this.nomeGeneroMusical = nomeGeneroMusical;
	}

}
