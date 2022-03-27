package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.Student;

public interface StudentService {
	void save(Student student);
	void update(Student student);
	Student getStudentById(String id);
	List<Student> getList();
	void deleteById(String id);
}
