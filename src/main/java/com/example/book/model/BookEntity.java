package com.example.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class BookEntity {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String Nombre;
	
	private String isbn;
	
	private String autor;
	
	private Integer paginas;
	
	private String colorPortada;

	public BookEntity(int idEntrada, String nombreEntrada, String isbnEntrada, String autorEntrada, int pagEntrada, String colorEntrada) {
		this.setId(idEntrada);
		this.Nombre = nombreEntrada;
		this.isbn = isbnEntrada;
		this.autor = autorEntrada;
		this.paginas = pagEntrada;
		this.colorPortada = colorEntrada;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public String getColorPortada() {
		return colorPortada;
	}

	public void setColorPortada(String colorPortada) {
		this.colorPortada = colorPortada;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
