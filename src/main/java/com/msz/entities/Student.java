package com.msz.entities;

public class Student {
	private int studentId;
	private String sutdentName;
	private int studentAge;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSutdentName() {
		return sutdentName;
	}

	public void setSutdentName(String sutdentName) {
		this.sutdentName = sutdentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sutdentName=" + sutdentName + ", studentAge=" + studentAge + "]";
	}

}
