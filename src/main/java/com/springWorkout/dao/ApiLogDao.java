package com.springWorkout.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springWorkout.domain.ApiLog;

/**
 * @author erhun.baycelik
 *
 */
@Repository
public class ApiLogDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(ApiLog apiLog) {
		Session session = sessionFactory.getCurrentSession();
		session.save(apiLog);
	}

	public void saveOrUpdate(ApiLog apiLog) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(apiLog);
	}
}
