package fpt.fa.repository.impl;

import java.util.List;

import javax.transaction.Transactional;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.May;
import fpt.fa.entities.Student;
import fpt.fa.repository.MayRepository;

@Transactional
@Repository
public class MayRepositoryImpl implements MayRepository{
	//setter injection
	@Autowired
	SessionFactory sessionFactory;
	
	
	//constructor injection
//	@Autowired
//	public MayRepositoryImpl(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
	
	
	
	@Override
	public void save(May May) {
		sessionFactory.getCurrentSession().save(May);
		
		
	}

	@Override
	public void update(May May) {
		sessionFactory.getCurrentSession().update(May);
		
	}

	@Override
	public May getMayById(String id) {
		
		return sessionFactory.getCurrentSession().find(May.class, id);
	}

	@Override
	public List<May> getList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("From May").list();
	}

	@Override
	public void deleteById(String id) {
		May may = getMayById(id);
		sessionFactory.getCurrentSession().delete(may);
		
	}

}
