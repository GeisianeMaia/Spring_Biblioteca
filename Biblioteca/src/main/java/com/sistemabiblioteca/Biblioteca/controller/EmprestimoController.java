package com.sistemabiblioteca.Biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sistemabiblioteca.Biblioteca.model.Emprestimo;
import com.sistemabiblioteca.Biblioteca.repository.EmprestimoRepository;

@RestController
@RequestMapping("/emprestimo")
@CrossOrigin("*")
public class EmprestimoController {

	@Autowired
	private EmprestimoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Emprestimo>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{idEmp}")
	public ResponseEntity<Emprestimo> GetById(@ PathVariable long idEmp){
		return repository.findById(idEmp)
				.map(resp->ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
				
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Emprestimo>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<Emprestimo> post(@RequestBody Emprestimo emprestimo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(emprestimo));
	}
	
	@PutMapping
	public ResponseEntity<Emprestimo> put(@RequestBody Emprestimo emprestimo){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(emprestimo));
	}
	
	@DeleteMapping("/{idEmp}")
	public void delete(@PathVariable long idEmp) {
		repository.deleteById(idEmp);
	}
}
