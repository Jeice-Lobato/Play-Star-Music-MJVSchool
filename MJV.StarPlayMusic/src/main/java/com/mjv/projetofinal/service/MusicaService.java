package com.mjv.projetofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.model.Musica;
import com.mjv.projetofinal.repository.MusicaRepository;

@Service
public class MusicaService {

	@Autowired
	private MusicaRepository repository;

	public void save(Musica musica) {
		repository.save(musica);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);

	}

	public List<Musica> listar() {
		return repository.findAll();
	}
}