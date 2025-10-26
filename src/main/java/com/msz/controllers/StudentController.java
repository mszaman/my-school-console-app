package com.msz.controllers;

import java.util.Map;

import com.msz.entities.Student;
import com.msz.factory.Factory;
import com.msz.mappers.StudentMapper;
import com.msz.repositories.RepositoryInterface;

public class StudentController {
	private RepositoryInterface<Integer, Student> studentRepo;
	private StudentMapper studentMapper;

	public StudentController() {
		this.studentRepo = Factory.studentService();
	}

	public void saveStudent(String studentName, int studentAge) {
		this.studentMapper = new StudentMapper(Factory.student());

		this.studentMapper.setStudent(studentName, studentAge);

		this.studentRepo.save(this.studentMapper.getStudent());

	}

	public Map<Integer, Student> getAllStudents() {
		return this.studentRepo.findAll();
	}

}
