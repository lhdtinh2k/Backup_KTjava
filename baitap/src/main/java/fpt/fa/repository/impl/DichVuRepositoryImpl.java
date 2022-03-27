package fpt.fa.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.DichVu;
import fpt.fa.repository.DichVuRepository;

@Transactional
@Repository
public class DichVuRepositoryImpl implements DichVuRepository{
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void save(DichVu DichVu) {
		sessionFactory.getCurrentSession().save(DichVu);
		
	}

	@Override
	public void update(DichVu DichVu) {
		sessionFactory.getCurrentSession().update(DichVu);
		
	}

	@Override
	public DichVu getDichVuById(String id) {
		return sessionFactory.getCurrentSession().find(DichVu.class, id);
	}

	@Override
	public List<DichVu> getList() {
		return sessionFactory.getCurrentSession().createQuery("From DichVu").list();
	}

	@Override
	public void deleteById(String id) {
		DichVu dv = getDichVuById(id);
		sessionFactory.getCurrentSession().delete(dv);
		
	}

}
