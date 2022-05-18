package com.mjv.projetofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.model.Playlist;
import com.mjv.projetofinal.repository.PlaylistRepository;

@Service
public class PlaylistService {

	@Autowired
	private PlaylistRepository repository;

	public void save(Playlist playlist) {
		repository.save(playlist);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);

	}

	public List<Playlist> listar() {
		return repository.findAll();
	}

}
