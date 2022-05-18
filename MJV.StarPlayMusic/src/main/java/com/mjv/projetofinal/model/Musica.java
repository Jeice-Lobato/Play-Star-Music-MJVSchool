package com.mjv.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_musica")
public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome_musica")
	private String nomeMusica;

	@Column(name = "artista_id")
	private Integer artista;

	@Column(name = "genero_musical_id")
	private Integer generoMusical;

	@Column(name = "album_musica")
	private String albumMusica;

	@Column(name = "tempo_musica")
	private String tempoMusica;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public Integer getArtista() {
		return artista;
	}

	public void setArtista(Integer artista) {
		this.artista = artista;
	}

	public Integer getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(Integer generoMusical) {
		this.generoMusical = generoMusical;
	}

	public String getAlbumMusica() {
		return albumMusica;
	}

	public void setAlbumMusica(String albumMusica) {
		this.albumMusica = albumMusica;
	}

	public String getTempoMusica() {
		return tempoMusica;
	}

	public void setTempoMusica(String tempoMusica) {
		this.tempoMusica = tempoMusica;
	}

}