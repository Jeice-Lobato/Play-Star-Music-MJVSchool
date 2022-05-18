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

import com.mjv.projetofinal.model.Artista;
import com.mjv.projetofinal.service.ArtistaService;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

	@Autowired
	private ArtistaService service;

	@PostMapping
	public void gravar(@RequestBody Artista artista) {
		service.save(artista);
	}

	@GetMapping
	public List<Artista> listar() {
		return service.listar();
		// Quando a classe a repository chamar o método find.all, vai devolver uma lista
		// de artista fake.
	}

	@PutMapping
	public void alterar(@RequestBody Artista artista) {
		// id = 1, Automaticamente ele atualizará.
		service.save(artista);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

}
