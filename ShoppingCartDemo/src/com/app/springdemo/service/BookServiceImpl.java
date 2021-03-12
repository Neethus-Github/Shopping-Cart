package com.app.springdemo.service;

import java.util.List;

import javax.persistence.Access;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springdemo.dao.BookDAO;
import com.app.springdemo.entity.Book;
import com.app.springdemo.entity.Order;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookDAO;
	
	
	@Override
	@Transactional
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getBooks();
	}
	
	@Override
	@Transactional
	public Book getBook(String theId) {
		// TODO Auto-generated method stub
		return  bookDAO.getBook(theId);
	}

	@Override
	@Transactional
	public void saveOrder(Order theOrder) {
		// TODO Auto-generated method stub
		bookDAO.saveOrder(theOrder);
	}
	
	@Override
	@Transactional
	public void deleteOrder(int theId) {
		// TODO Auto-generated method stub
		bookDAO.deleteOrder(theId);
	}
}
