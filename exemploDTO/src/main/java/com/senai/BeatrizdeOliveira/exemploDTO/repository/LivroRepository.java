package com.senai.BeatrizdeOliveira.exemploDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.BeatrizdeOliveira.exemploDTO.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}