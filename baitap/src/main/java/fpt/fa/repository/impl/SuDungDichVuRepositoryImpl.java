package fpt.fa.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.SuDungDichVu;
import fpt.fa.repository.SuDungDichVuRepository;

@Transactional
@Repository
public class SuDungDichVuRepositoryImpl implements SuDungDichVuRepository{

	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void save(SuDungDichVu suDungDichVu) {
		sessionFactory.getCurrentSession().save(suDungDichVu);
		
	}

	@Override
	public void update(SuDungDichVu suDungDichVu) {
		sessionFactory.getCurrentSession().update(suDungDichVu);
		
	}

	@Override
	public SuDungDichVu getSuDungDichVuById(int id) {
		return sessionFactory.getCurrentSession().find(SuDungDichVu.class, id);
	}

	@Override
	public List<SuDungDichVu> getList() {
		return sessionFactory.getCurrentSession().createQuery("From SuDungDichVu").list();
	}

	@Override
	public void deleteById(int id) {
		SuDungDichVu suDungDichVu = getSuDungDichVuById(id);
		sessionFactory.getCurrentSession().delete(suDungDichVu);
	}

}
