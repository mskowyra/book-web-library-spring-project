package com.skowyra.libria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skowyra.libria.model.books.Books;
import com.skowyra.libria.service.BookService;

/**
 * @author Maciej Skowyra
 * @since 3 lut 2015 17:47:54
 */
@Controller
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("book", new Books());
		return "book.add";
	}
	
	
	@RequestMapping(value = "/book/add", method = RequestMethod.GET)
	public String newBook(Model model) {

		model.addAttribute("book", new Books());

		return "book.add";
	}

	
	@RequestMapping(value = "/book/add", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("book") Books books,
			BindingResult result,
			@RequestParam("category.categoryId") Long subcategoryId,
			@RequestParam("author.authorId") Long authorId, Model model) {

		bookService.createBook(books, authorId, subcategoryId);

		return "redirect:/book/tx";
	}

}
