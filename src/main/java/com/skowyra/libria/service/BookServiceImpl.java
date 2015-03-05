package com.skowyra.libria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skowyra.libria.dao.AuthorDao;
import com.skowyra.libria.dao.BookDao;
import com.skowyra.libria.dao.SubcategoryDao;
import com.skowyra.libria.model.books.Author;
import com.skowyra.libria.model.books.Books;
import com.skowyra.libria.model.books.Subcategory;

/**
 * @author Maciej Skowyra
 * @since 3 lut 2015
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	@Autowired
	private AuthorDao authorDao;
	@Autowired
	private SubcategoryDao subcategoryDao;
	
	
	public void createBook(Books books, Long authorId, Long subcategoryId) {
	
		if(authorId != 0 && subcategoryId != 0) bookDao.create(books);
		else {
			Author author = authorDao.get(authorId);
			Subcategory subcategory = subcategoryDao.get(subcategoryId);
			books.setAuthor(author);
			books.setSubcategory(subcategory);
			bookDao.create(books);
		}
			
 }
	
	public Books findById(Long bookId){
		
		return this.bookDao.get(bookId);
		
	};
	
	public List<Books> getBooks() {
		return bookDao.getAll();
	}

	
	public void removeBookById(Long id) {
		this.bookDao.deleteById(id);
	}
	
	public void removeBook(Books books){
		this.bookDao.delete(books);
	}
	

}
