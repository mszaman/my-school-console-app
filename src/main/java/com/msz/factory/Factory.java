package com.msz.factory;

import java.util.Scanner;

import com.msz.controllers.StudentController;
import com.msz.entities.Student;
import com.msz.services.StudentService;
import com.msz.views.StudentMenu;

public class Factory {

	private static StudentMenu studentMenu = null;
	private static Student student = null;
	private static StudentService studentService = null;
	private static StudentController studentController = null;
	private static Scanner scanner = null;

	public static StudentMenu studentMenu() {
		if (studentMenu == null) {
			studentMenu = new StudentMenu();
		}
		return studentMenu;
	}

	public static Student student() {
		if (student == null) {
			student = new Student();
		}
		return student;
	}

	public static StudentService studentService() {
		if (studentService == null) {
			studentService = new StudentService();
		}
		return studentService;
	}

	public static StudentController studentController() {
		if (studentController == null) {
			studentController = new StudentController();

		}
		return studentController;
	}

	public static Scanner scanner() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
