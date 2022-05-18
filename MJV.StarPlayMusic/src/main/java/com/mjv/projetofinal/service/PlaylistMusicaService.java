package com.mjv.projetofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.model.PlaylistMusica;
import com.mjv.projetofinal.repository.PlaylistMusicaRepository;

@Service
public class PlaylistMusicaService {

	@Autowired
	private PlaylistMusicaRepository repository;

	public void save(PlaylistMusica PlaylistMusica) {
		repository.save(PlaylistMusica);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);

	}

	public List<PlaylistMusica> listar() {
		return repository.findAll();
	}

}
