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

import com.mjv.projetofinal.model.PlaylistMusica;
import com.mjv.projetofinal.service.PlaylistMusicaService;

@RestController
@RequestMapping("/playlist_musica")
public class PlaylistMusicaController {

	@Autowired
	private PlaylistMusicaService service;

	@PostMapping
	public void gravar(@RequestBody PlaylistMusica playlistMusica) {
		service.save(playlistMusica);

	}

	@GetMapping
	public List<PlaylistMusica> listar() {
		return service.listar();
	}

	@PutMapping
	public void alterar(@RequestBody PlaylistMusica playlistMusica) {
		// id = 1, Automaticamente ele atualizará.
		service.save(playlistMusica);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

}
