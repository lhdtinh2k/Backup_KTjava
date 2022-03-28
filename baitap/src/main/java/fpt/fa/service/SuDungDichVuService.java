package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.SuDungDichVu;
import fpt.fa.form.DangKyKhoaHocForm;
import fpt.fa.form.DangKySuDungDichVuForm;

public interface SuDungDichVuService {
	void save(SuDungDichVu suDungDichVu);
	void update(SuDungDichVu suDungDichVu);
	SuDungDichVu getSuDungDichVuById(int id);
	List<SuDungDichVu> getList();
	void dangKySuDungDichVu(DangKySuDungDichVuForm form);
	void deleteById(int id);
}
