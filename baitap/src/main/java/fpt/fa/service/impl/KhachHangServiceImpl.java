package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.KhachHang;
import fpt.fa.repository.KhachHangReporistory;
import fpt.fa.service.KhachHangService;

//them tag service
@Service
public class KhachHangServiceImpl implements KhachHangService{

	private KhachHangReporistory repository; 
	
	@Autowired
	public KhachHangServiceImpl(KhachHangReporistory repository) {
		this.repository = repository;
	}
	
	
	@Override
	public void save(KhachHang KhachHang) {
		this.repository.save(KhachHang);
		
	}

	@Override
	public void update(KhachHang KhachHang) {
		this.repository.update(KhachHang);
		
	}

	@Override
	public KhachHang getKhachHangById(int id) {
		return this.repository.getKhachHangById(id);
	}

	@Override
	public List<KhachHang> getList() {
		return this.repository.getList();
	}

	@Override
	public void deleteById(int id) {
		this.repository.deleteById(id);
		
	}

}
