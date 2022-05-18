package com.mjv.projetofinal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_playlist")
public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome_playlist")
	private String nomePlaylist;

	@Column(name = "id_usuario")
	private Integer usuario;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_playlist")
	private List<PlaylistMusica> musicas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomePlaylist() {
		return nomePlaylist;
	}

	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public List<PlaylistMusica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<PlaylistMusica> musicas) {
		this.musicas = musicas;
	}

}
