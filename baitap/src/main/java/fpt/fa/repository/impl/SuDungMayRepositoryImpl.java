package fpt.fa.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.SuDungMay;
import fpt.fa.repository.SuDungMayRepository;

@Transactional
@Repository
public class SuDungMayRepositoryImpl implements SuDungMayRepository{

	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void save(SuDungMay suDungMay) {
		sessionFactory.getCurrentSession().save(suDungMay);
		
	}

	@Override
	public void update(SuDungMay suDungMay) {
		sessionFactory.getCurrentSession().update(suDungMay);
		
	}

	@Override
	public SuDungMay getSuDungMayById(int id) {
		return sessionFactory.getCurrentSession().find(SuDungMay.class, id);
	}

	@Override
	public List<SuDungMay> getList() {
		return sessionFactory.getCurrentSession().createQuery("From SuDungMay").list();
	}

	@Override
	public void deleteById(int id) {
		SuDungMay suDungMay = getSuDungMayById(id);
		sessionFactory.getCurrentSession().delete(suDungMay);
		
	}

}
