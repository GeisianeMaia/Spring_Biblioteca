package com.sistemabiblioteca.Biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemabiblioteca.Biblioteca.model.Emprestimo;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

	public List<Emprestimo> findAllByTituloContainingIgnoreCase(String titulo);
	
}
