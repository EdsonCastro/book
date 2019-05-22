package com.example.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.book.dto.BookDto;
import com.example.book.model.BookEntity;
import com.example.book.service.MapperService;



@SpringBootApplication
public class BookApplication implements CommandLineRunner{

		@Autowired private MapperService<BookDto, BookEntity> mapperservice;

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		BookEntity bookE = new BookEntity(1, "Historia", "1234-B", "Juan", 345, "azul");
		BookDto bookDto = mapperservice.map(bookE);;
		
		System.out.println("Nombre ="+ bookDto.getNombre());
		System.out.println("isbn ="+ bookDto.getIsbn());
		System.out.println("paginas ="+ bookDto.getPaginas());
		
	}

}
