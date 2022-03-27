package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.DichVu;


public interface DichVuRepository {
	void save(DichVu DichVu);
	void update(DichVu DichVu);
	DichVu getDichVuById(String id);
	List<DichVu> getList();
	void deleteById(String id);

}
