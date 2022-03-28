package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.DichVu;
import fpt.fa.entities.KhachHang;

import fpt.fa.entities.Student;
import fpt.fa.entities.SuDungDichVu;
import fpt.fa.form.DangKySuDungDichVuForm;
import fpt.fa.repository.SuDungDichVuRepository;
import fpt.fa.service.DichVuService;
import fpt.fa.service.KhachHangService;

import fpt.fa.service.SuDungDichVuService;

@Service
public class SuDungDichVuServiceImpl implements SuDungDichVuService {

	
	@Autowired
	DichVuService dichVuService;
	@Autowired
	KhachHangService khachHangService;
	
	// Them autowired
	private SuDungDichVuRepository repository;

	@Autowired
	public SuDungDichVuServiceImpl(SuDungDichVuRepository repository) {
		this.repository = repository;
	}

	@Override
	public void save(SuDungDichVu suDungDichVu) {
		this.repository.save(suDungDichVu);

	}

	@Override
	public void update(SuDungDichVu suDungDichVu) {
		this.repository.update(suDungDichVu);

	}

	@Override
	public SuDungDichVu getSuDungDichVuById(int id) {
		return this.repository.getSuDungDichVuById(id);
	}

	@Override
	public List<SuDungDichVu> getList() {
		return this.repository.getList();
	}

	@Override
	public void deleteById(int id) {
		this.repository.deleteById(id);

	}

	@Override
	public void dangKySuDungDichVu(DangKySuDungDichVuForm form) {
//		SuDungDichVu sd;
//		sd
//		this.save(form);
	}

}
