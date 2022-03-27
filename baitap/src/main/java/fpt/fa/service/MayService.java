package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.May;

public interface MayService {
	void save(May May);
	void update(May May);
	May getMayById(int id);
	List<May> getList();
	void deleteById(int id);
}
