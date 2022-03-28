package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.SuDungDichVu;

public interface SuDungDichVuRepository {
	void save(SuDungDichVu suDungDichVu);
	void update(SuDungDichVu suDungDichVu);
	SuDungDichVu getSuDungDichVuById(int id);
	List<SuDungDichVu> getList();
	void deleteById(int id);
}
