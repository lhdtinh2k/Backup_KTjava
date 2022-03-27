package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.DichVu;
import fpt.fa.repository.DichVuRepository;
import fpt.fa.service.DichVuService;

//them tag service
@Service
public class DichVuSerciveImpl implements DichVuService{

	//Them autowired
	private DichVuRepository repository; 
	
	@Autowired
	public DichVuSerciveImpl(DichVuRepository repository) {
		this.repository = repository;
	}	
	
	
	@Override
	public void save(DichVu DichVu) {
		this.repository.save(DichVu);
	}

	@Override
	public void update(DichVu DichVu) {
		this.repository.save(DichVu);
		
	}

	@Override
	public DichVu getDichVuById(String id) {
		return this.repository.getDichVuById(id);
	}

	@Override
	public List<DichVu> getList() {
		return this.repository.getList();
	}

	@Override
	public void deleteById(String id) {
		this.repository.deleteById(id);
		
	}

}
