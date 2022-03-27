package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.DichVu;

public interface DichVuService {
	void save(DichVu DichVu);
	void update(DichVu DichVu);
	DichVu getDichVuById(String id);
	List<DichVu> getList();
	void deleteById(String id);
}
