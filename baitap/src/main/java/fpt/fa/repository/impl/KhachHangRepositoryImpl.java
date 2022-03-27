package fpt.fa.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.KhachHang;
import fpt.fa.repository.KhachHangReporistory;


@Transactional
@Repository
public class KhachHangRepositoryImpl implements KhachHangReporistory{	//nho them tag

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(KhachHang KhachHang) {
		sessionFactory.getCurrentSession().save(KhachHang);
	}

	@Override
	public void update(KhachHang KhachHang) {
		sessionFactory.getCurrentSession().update(KhachHang);
		
	}

	@Override
	public KhachHang getKhachHangById(int id) {
		return sessionFactory.getCurrentSession().find(KhachHang.class, id);
	}

	@Override
	public List<KhachHang> getList() {
		return sessionFactory.getCurrentSession().createQuery("From KhachHang").list();
	}

	@Override
	public void deleteById(int id) {
		KhachHang KH = getKhachHangById(id);
		sessionFactory.getCurrentSession().delete(KH);
	}

}
