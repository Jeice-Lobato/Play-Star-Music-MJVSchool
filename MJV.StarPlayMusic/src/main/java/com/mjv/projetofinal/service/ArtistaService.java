package com.mjv.projetofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.model.Artista;
import com.mjv.projetofinal.repository.ArtistaRepository;

@Service
public class ArtistaService {

	@Autowired
	private ArtistaRepository repository;

	public void save(Artista artista) {
		repository.save(artista);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);

	}

	public List<Artista> listar() {
		return repository.findAll();
	}

}
