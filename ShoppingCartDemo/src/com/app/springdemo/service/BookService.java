package com.app.springdemo.service;

import java.util.List;

import com.app.springdemo.entity.Book;
import com.app.springdemo.entity.Order;

public interface BookService {
	
	public List<Book> getBooks();
	public void saveOrder(Order theOrder);
	public Book getBook(String theId);
	public void deleteOrder(int theId); 
}
