package com.app.springdemo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.springdemo.entity.Book;
import com.app.springdemo.entity.Order;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		//create a query
		Query<Book> theQuery = currentSession.createQuery("from Book",Book.class);
		List<Book> books = theQuery.getResultList();
		return books;
	}


	@Override
	public void saveOrder(Order theOrder) {
		// TODO Auto-generated method stub
		//get current session
		Session currentSession = sessionFactory.getCurrentSession();
		//save Customer
		currentSession.saveOrUpdate(theOrder);
	}


	


	@Override
	public Book getBook(String theId) {
		// TODO Auto-generated method stub
		Session curretSession=sessionFactory.getCurrentSession();
		Book theBook=curretSession.get(Book.class, theId);
		return theBook;
	}


	@Override
	public void deleteOrder(int theId) {
		// TODO Auto-generated method stub
		Session curretSession=sessionFactory.getCurrentSession();
		Order theOrder=curretSession.get(Order.class,theId);
		curretSession.delete(theOrder);
	}
	

	

	
	
	
	

}
