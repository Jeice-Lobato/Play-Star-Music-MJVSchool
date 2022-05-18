package com.mjv.projetofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.model.Usuario;
import com.mjv.projetofinal.repository.UsuarioRepository;

@Service

public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public void save(Usuario usuario) {
		repository.save(usuario);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);

	}

	public List<Usuario> listar() {
		return repository.findAll();
	}
}

/*
 * public Usuario listarId(Integer id) { // TODO Auto-generated method stub //
 * return repositoryu.findById(id); Optional<Usuario> obj =
 * repository.findById(id); Usuario entity = obj.orElseThrow(() -> new
 * ResourceNotFoundException("Entity not found")); return entity; }
 */
