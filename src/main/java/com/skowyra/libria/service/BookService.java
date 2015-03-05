package com.skowyra.libria.service;

import java.util.List;

import com.skowyra.libria.model.books.Books;

/**
 * @author Maciej Skowyra
 * @since 3 lut 2015 17:48:50
 */
public interface BookService {

	public void createBook(Books books, Long authorId, Long subcategoryId);
	public void removeBookById(Long id);
	public void removeBook(Books books);
	public Books findById(Long bookId);
	List<Books> getBooks();
	
}
