package com.mjv.projetofinal.controller;

import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.Usuario;
import com.mjv.projetofinal.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

	@Autowired
	private UsuarioService service;

	// private static Logger logger =
	// LoggerFactory.getLogger(UsuarioController.class);

	@PostMapping
	public void gravar(@RequestBody Usuario usuario) {
		service.save(usuario);

	}

	@GetMapping
	public List<Usuario> listar() {
		return service.listar();

	}

	/*
	 * @GetMapping(value = "/{id}") public Usuario listarId(@PathVariable Integer
	 * id) { logger.info("User id: " + id); return service.listarId(id);
	 * 
	 * }
	 */

	@PutMapping
	public void alterar(@RequestBody Usuario usuario) {
		service.save(usuario);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}
}
