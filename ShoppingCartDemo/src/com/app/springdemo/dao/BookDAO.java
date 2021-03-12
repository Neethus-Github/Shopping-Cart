package com.app.springdemo.dao;

import java.util.List;

import com.app.springdemo.entity.Book;
import com.app.springdemo.entity.Order;


public interface BookDAO {
	
	public List<Book> getBooks();
	public void saveOrder(Order theOrder);
	public Book getBook(String theId);
	public void deleteOrder(int theId);
}
