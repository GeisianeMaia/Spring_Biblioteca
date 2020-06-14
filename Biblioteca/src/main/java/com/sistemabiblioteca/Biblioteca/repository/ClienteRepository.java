package com.sistemabiblioteca.Biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemabiblioteca.Biblioteca.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	public List<Cliente> findAllByNomeContainingIgnoreCase(String cpf);
}
