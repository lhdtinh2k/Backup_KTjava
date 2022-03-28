package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.SuDungMay;

public interface SuDungMayService {
	void save(SuDungMay suDungMay);
	void update(SuDungMay suDungMay);
	SuDungMay getSuDungMayById(int id);
	List<SuDungMay> getList();
	void deleteById(int id);
}
