package com.sistemabiblioteca.Biblioteca.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="emprestimo")
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long idEmp;
	
	@NotNull
	@Size(min=5, max=100)
	private String titulo;
	
	

	@Temporal(TemporalType.TIMESTAMP)
	private Date data  = new java.sql.Date(System.currentTimeMillis());

	@Size(min=1, max=5)
	private String quantidade;
	
	//@ManyToOne
	//JoinColumn(name="id", referencedColumnName="id"
	//private Livro livro;
	
	//@ManyToOne
	//JoinColumn(name="id", referencedColumnName="id"
	//private Cliente cliente;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(long idEmp) {
		this.idEmp = idEmp;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
