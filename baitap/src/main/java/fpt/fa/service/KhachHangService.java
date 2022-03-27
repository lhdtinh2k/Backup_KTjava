package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.KhachHang;

public interface KhachHangService {
	void save(KhachHang KhachHang);
	void update(KhachHang KhachHang);
	KhachHang getKhachHangById(int id);
	List<KhachHang> getList();
	void deleteById(int id);
}
