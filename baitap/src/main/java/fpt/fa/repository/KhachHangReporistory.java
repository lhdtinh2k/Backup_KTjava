package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.KhachHang;

public interface KhachHangReporistory {
		void save(KhachHang KhachHang);
		void update(KhachHang KhachHang);
		KhachHang getKhachHangById(String id);
		List<KhachHang> getList();
		void deleteById(String id);
	
}
