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

import com.mjv.projetofinal.model.Musica;
import com.mjv.projetofinal.service.MusicaService;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

	@Autowired
	private MusicaService service;

	@PostMapping
	public void gravar(@RequestBody Musica musicas) {
		service.save(musicas);

	}

	@GetMapping
	public List<Musica> listar() {
		return service.listar();
	}

	@PutMapping
	public void alterar(@RequestBody Musica musica) {
		// id = 1, Automaticamente ele atualizará.
		service.save(musica);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

}
