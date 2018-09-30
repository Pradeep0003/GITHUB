package com.niit.shopbackend.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shopbackend.model.UserDetails;

@Transactional
@Repository
public class UserDetailsRepositoryImpl {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean addUserDetails(UserDetails userdetails) {
		Session session=sessionFactory.getCurrentSession();
		try{
		session.save(userdetails);
		return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteUserDetails(int userdetailsId) {
		Session session=sessionFactory.getCurrentSession();
		try{
		session.delete(getUserDetailsById(userdetailsId));
		return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}}
	public boolean updateCategory(UserDetails userdetails) {
		Session session=sessionFactory.getCurrentSession();
		try{
		session.update(userdetails);
		return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}}
	public UserDetails getUserDetailsById(int UserDetailsId) {
		Session session=sessionFactory.getCurrentSession();
		try{
	    UserDetails userdetails=(UserDetails)session.get(UserDetails.class,UserDetailsId);
		return userdetails;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public List<UserDetails> getAllUserDetails(int userdetailsId) {
		
		Session session=sessionFactory.getCurrentSession();
		try{
		Query query=session.createQuery("from UserDetails");
		List<UserDetails> userdetailsList=(List<UserDetails>)query.getResultList();
		return userdetailsList;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	

	}
}


