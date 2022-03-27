package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.Student;

public interface StudentRepository {
	void save(Student student);
	void update(Student student);
	Student getStudentById(String id);
	List<Student> getList();
	void deleteById(String id);
}
