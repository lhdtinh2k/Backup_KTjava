package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.KhachHang;

public interface KhachHangReporistory {
		void save(KhachHang KhachHang);
		void update(KhachHang KhachHang);
		KhachHang getKhachHangById(int id);
		List<KhachHang> getList();
		void deleteById(int id);
	
}
