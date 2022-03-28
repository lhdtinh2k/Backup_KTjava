package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.SuDungMay;
import fpt.fa.repository.SuDungMayRepository;
import fpt.fa.service.SuDungMayService;

@Service
public class SuDungMayServiceImpl implements SuDungMayService {

	// Them autowired
	private SuDungMayRepository repository;

	@Autowired
	public SuDungMayServiceImpl(SuDungMayRepository repository) {
		this.repository = repository;
	}

	@Override
	public void save(SuDungMay suDungMay) {
		this.repository.save(suDungMay);

	}

	@Override
	public void update(SuDungMay suDungMay) {
		this.repository.update(suDungMay);

	}

	@Override
	public SuDungMay getSuDungMayById(int id) {
		return this.repository.getSuDungMayById(id);
	}

	@Override
	public List<SuDungMay> getList() {
		return this.repository.getList();
	}

	@Override
	public void deleteById(int id) {
		this.repository.deleteById(id);

	}

}
