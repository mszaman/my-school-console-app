package com.msz.mappers;

import com.msz.entities.Student;

public class StudentMapper {
	private Student student;

	public StudentMapper(Student student) {
		this.student = student;
	}

	public void setStudent(String sutdentName, int studentAge) {
		this.student.setSutdentName(sutdentName);
		this.student.setStudentAge(studentAge);
	}

	public Student getStudent() {
		return this.student;
	}
}
