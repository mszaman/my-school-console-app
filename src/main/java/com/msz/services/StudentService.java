package com.msz.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.msz.entities.Student;
import com.msz.repositories.RepositoryInterface;

public class StudentService implements RepositoryInterface<Integer, Student> {

	Map<Integer, Student> students = new HashMap<>();

	@Override
	public String save(Integer key, Student obj) {
		int id = students.size() + 1;
		obj.setStudentId(id);
		students.put(id, obj);
		return "The Student is Added.";
	}

	@Override
	public Map<Integer, Student> findAll() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public List<Student> findById(Integer id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

}
