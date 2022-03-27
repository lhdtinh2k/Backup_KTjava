package fpt.fa.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.Student;
import fpt.fa.repository.StudentRepository;

@Transactional
@Repository
public class StudentRepositoryImpl implements StudentRepository {
	// setter injection
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public void update(Student student) {
		sessionFactory.getCurrentSession().update(student);
	}

	@Override
	public Student getStudentById(String id) {
		return sessionFactory.getCurrentSession().find(Student.class, id);
	}

	@Override
	public List<Student> getList() {
		return sessionFactory.getCurrentSession().createQuery("From Student").list();
	}

	@Override
	public void deleteById(String id) {
		Student student = getStudentById(id);
		sessionFactory.getCurrentSession().delete(student);
	}

}
