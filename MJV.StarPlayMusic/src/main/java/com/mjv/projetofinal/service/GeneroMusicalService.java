package com.mjv.projetofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.model.GeneroMusical;
import com.mjv.projetofinal.repository.GeneroMusicalRepository;

@Service
public class GeneroMusicalService {

	@Autowired
	private GeneroMusicalRepository repository;

	public void save(GeneroMusical generoMusical) {
		repository.save(generoMusical);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);

	}

	public List<GeneroMusical> listar() {
		return repository.findAll();
	}

}
