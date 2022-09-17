package com.store.startlight_store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller// dùng để đn Controller
@RequestMapping("books")//localhost:8080/books// @RequestMapping dùng để định nghĩa url
public class BooksController {
	// đến đây thì địa chỉ web là localhost:8080/books/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getBookIndex()
	{
		return "books";// books.html
	}
}
