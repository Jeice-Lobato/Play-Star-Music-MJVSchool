package com.mjv.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
