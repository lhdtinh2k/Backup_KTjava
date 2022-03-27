package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.Student;
import fpt.fa.repository.StudentRepository;
import fpt.fa.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepository repository; 

	// constructor injection
	@Autowired
	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void save(Student student) {
		this.repository.save(student);
	}

	@Override
	public void update(Student student) {
		this.repository.update(student);
	}

	@Override
	public Student getStudentById(String id) {
		return this.repository.getStudentById(id);
	}

	@Override
	public List<Student> getList() {
		return this.repository.getList();
	}

	@Override
	public void deleteById(String id) {
		this.repository.deleteById(id);
	}

}
