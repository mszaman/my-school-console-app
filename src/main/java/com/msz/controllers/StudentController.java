package com.msz.controllers;

import com.msz.entities.Student;
import com.msz.factory.GetNew;
import com.msz.mappers.StudentMapper;
import com.msz.repositories.RepositoryInterface;
import com.msz.services.StudentService;

public class StudentController {
	private RepositoryInterface<Integer, Student> studentRepo;

	public StudentController() {
		this.studentRepo = GetNew.studentService();
	}

	public void saveStudent(String studentName, int studentAge) {
		StudentMapper studentMapper = new StudentMapper(GetNew.student());

		studentMapper.setStudent(studentName, studentAge);

		studentRepo = new StudentService();

		studentRepo.save(studentMapper.getStudent());
	}

}
