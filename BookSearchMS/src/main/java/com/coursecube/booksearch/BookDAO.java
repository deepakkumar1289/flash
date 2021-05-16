package com.coursecube.booksearch;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book,Integer> {
	public List<Book> getBooksByAuthorAndCategory(String author,String category);
	public List<Book> getBooksByAuthor(String author);
	public List<Book> getBooksByCategory(String category);
}
