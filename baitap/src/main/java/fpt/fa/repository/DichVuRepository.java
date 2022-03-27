package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.DichVu;


public interface DichVuRepository {
	void save(DichVu DichVu);
	void update(DichVu DichVu);
	DichVu getDichVuById(int id);
	List<DichVu> getList();
	void deleteById(int id);

}
