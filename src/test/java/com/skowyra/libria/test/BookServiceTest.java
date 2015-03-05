package com.skowyra.libria.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.skowyra.libria.dao.AuthorDao;
import com.skowyra.libria.dao.BookDao;
import com.skowyra.libria.dao.CategoryDao;
import com.skowyra.libria.dao.SubcategoryDao;
import com.skowyra.libria.model.books.Author;
import com.skowyra.libria.model.books.Books;
import com.skowyra.libria.model.books.Category;
import com.skowyra.libria.model.books.Subcategory;
import com.skowyra.libria.service.BookService;


/**
 * @author Maciej Skowyra
 * @date Feb 11, 2015 10:31:58 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/application-context.xml", "/spring/hibernate-context.xml" })
public class BookServiceTest extends TestCase {

	@Autowired
	private BookService bookService;
	@Autowired
	private BookDao bookDao;
	@Autowired
	private AuthorDao authorDao;
	@Autowired
	private SubcategoryDao subcategoryDao;
	@Autowired
	private CategoryDao categoryDao;

	@Before
	@Transactional
	public void setUp() {
		Author author = new Author("Willie Wheeler");
		authorDao.create(author);

		Category category = new Category("Technology");
		categoryDao.create(category);

		Subcategory subcategory = new Subcategory("Programming", categoryDao
				.getAll().get(0));
		subcategoryDao.create(subcategory);

	}

// @Ignore
	@Test
	@Transactional
	@Rollback(false)
	public void testCreateBook() {
		Long subcategoryId = subcategoryDao.getAll().get(0).getSubcategoryId();
		Long authorId = authorDao.getAll().get(0).getAuthorId();

		Books books = new Books();
		books.setName("Spring in practise");
		bookService.createBook(books, authorId, subcategoryId);

		Assert.assertNotNull("Error! No added book", bookService.findById(books.getBookId()));

	}

	@Ignore
	@Test
	@Transactional
//	@Rollback(false)
	public void testRemoveBook() {

		Long subcategoryId = subcategoryDao.getAll().get(0).getSubcategoryId();
		Long authorId = authorDao.getAll().get(0).getAuthorId();

		Books books = new Books();
		books.setName("Spring in practise");

		bookService.createBook(books, authorId, subcategoryId);

		bookService.removeBookById(bookDao.getAll().get(0).getBookId());

		Assert.assertNull("Error! No remove book",	bookService.findById(books.getBookId()));

	}

}
