package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.GeneroMusical;
import com.mjv.projetofinal.service.GeneroMusicalService;

@RestController
@RequestMapping("/generoMusicais")
public class GeneroMusicalController {

	@Autowired
	private GeneroMusicalService service;

	@PostMapping
	public void gravar(@RequestBody GeneroMusical generoMusicais) {
		service.save(generoMusicais);
	}

	@GetMapping
	public List<GeneroMusical> listar() {
		return service.listar();
	}

	@PutMapping
	public void alterar(@RequestBody GeneroMusical generoMusical) {
		// id = 1, Automaticamente ele atualizará.
		service.save(generoMusical);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

}
