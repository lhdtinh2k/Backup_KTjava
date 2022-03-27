package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.May;

public interface MayRepository {
	void save(May May);
	void update(May May);
	May getMayById(String id);
	List<May> getList();
	void deleteById(String id);
}
