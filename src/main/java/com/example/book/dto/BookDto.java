package com.example.book.dto;


public class BookDto {	
	public BookDto(String nombre2, String isbn2, Integer paginas2) {
		this.nombre = nombre2;
		this.isbn = isbn2;
		this.paginas = paginas2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	private String nombre;	
	
	private String isbn;	
	
	private Integer paginas;
	
}
