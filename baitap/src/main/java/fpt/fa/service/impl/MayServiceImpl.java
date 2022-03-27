package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.May;
import fpt.fa.repository.MayRepository;
import fpt.fa.service.MayService;


@Service
public class MayServiceImpl implements MayService {

	private MayRepository repository;
	
	//constructor injection
	@Autowired
	public MayServiceImpl(MayRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void save(May May) {
		this.repository.save(May);
		
	}

	@Override
	public void update(May May) {
		this.repository.update(May);
		
	}

	@Override
	public May getMayById(int id) {
		return this.repository.getMayById(id);
	}

	@Override
	public List<May> getList() {
		// TODO Auto-generated method stub
		return this.repository.getList();
	}

	@Override
	public void deleteById(int id) {
		this.repository.deleteById(id);
		
	}

}
