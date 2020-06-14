package com.sistemabiblioteca.Biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//é uma entidade
@Table (name = "Livro")
//essa entidade dentro do bando de dados ela vai ser uma tabela

public class Livro {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	//um valor que vai ser gerado
	
	private long id; 
	
	@NotNull
	@Size(min=5,max=100)
	private String titulo;
	
	@NotNull
	@Size(min=5, max=200)
	private String editora;
	
	@Size(min=4, max=4)
	private int ano;
	
	//@OneToMany
	//JoinColumn(name="idEmp", referencedColumnName="idEmp"
	//private Emprestimo emprestimo;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

	
}
