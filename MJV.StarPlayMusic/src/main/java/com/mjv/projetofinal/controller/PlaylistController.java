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

import com.mjv.projetofinal.model.Playlist;
import com.mjv.projetofinal.service.PlaylistService;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

	@Autowired
	private PlaylistService service;

	@PostMapping
	public void gravar(@RequestBody Playlist playlists) {
		service.save(playlists);

	}

	@GetMapping
	public List<Playlist> listar() {
		return service.listar();
	}

	@PutMapping
	public void alterar(@RequestBody Playlist playlist) {
		// id = 1, Automaticamente ele atualizará.
		service.save(playlist);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

}
