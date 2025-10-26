package com.msz.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.msz.entities.Student;
import com.msz.repositories.RepositoryInterface;

public class StudentService implements RepositoryInterface<Integer, Student> {

	private Map<Integer, Student> students = new HashMap<>();

	@Override
	public String save(Student obj) {
		int id = this.students.size() + 1;
		obj.setStudentId(id);
		this.students.put(id, obj);
		return "The Student is Added.";
	}

	@Override
	public Map<Integer, Student> findAll() {
		return this.students;
	}

	@Override
	public List<Student> findById(Integer id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

}
