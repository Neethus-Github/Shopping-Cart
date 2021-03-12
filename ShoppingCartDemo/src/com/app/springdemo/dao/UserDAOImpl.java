package com.app.springdemo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.springdemo.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		//create a query
		Query<User> theQuery = currentSession.createQuery("from User",User.class);
		List<User> users = theQuery.getResultList();
		return users;
	}


	@Override
	public void saveUser(User theUser) {
		// TODO Auto-generated method stub
		//get current session
		Session currentSession = sessionFactory.getCurrentSession();
		//save User
		currentSession.saveOrUpdate(theUser);
	}


	@Override
	public List<User> loginUser(String username, String password) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		int found=0;
		String sQuery="from User where phone=:username and password=:password";
		Query query=session.createQuery(sQuery);
		query.setParameter("username", username);
		query.setParameter("password", password);
		List<User> list=query.getResultList();
		if((list!=null) && (list.size()>0)) {
			found=1;
		}
		session.close();
		return list;
	}


	@Override
	public User getUser(int theId) {
		// TODO Auto-generated method stub
		Session curretSession=sessionFactory.getCurrentSession();
		User theUser=curretSession.get(User.class, theId);
		return theUser;
	}

	@Override
	public void deleteUser(int theId) {
		// TODO Auto-generated method stub
		Session curretSession=sessionFactory.getCurrentSession();
		User theUser=curretSession.get(User.class,theId);
		curretSession.delete(theUser);
	}
	

	

	
	
	
	

}
