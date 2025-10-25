package com.msz.controllers;

import java.util.Map;

import com.msz.entities.Student;
import com.msz.factory.Factory;
import com.msz.mappers.StudentMapper;
import com.msz.repositories.RepositoryInterface;

public class StudentController {
	private RepositoryInterface<Integer, Student> studentRepo;

	public StudentController() {
		this.studentRepo = Factory.studentService();
	}

	public void saveStudent(String studentName, int studentAge) {
		StudentMapper studentMapper = new StudentMapper(Factory.student());

		studentMapper.setStudent(studentName, studentAge);

		this.studentRepo.save(studentMapper.getStudent());

	}

	public Map<Integer, Student> getAllStudents() {
		return this.studentRepo.findAll();
	}

}
