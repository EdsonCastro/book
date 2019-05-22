package com.example.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.book.dto.BookDto;
import com.example.book.model.BookEntity;

@Component
public class MapperServiceImpl implements MapperService<BookDto, BookEntity>{


	@Override
	public List map(List gdoDtoList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto map(BookEntity bookE) {
		BookDto bookDto = new BookDto(bookE.getNombre(), bookE.getIsbn(), bookE.getPaginas());
		return bookDto;
	}
	
	

	
	
}
