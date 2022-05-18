package com.mjv.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

}
