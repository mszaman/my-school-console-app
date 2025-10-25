package com.msz.factory;

import java.util.Scanner;

import com.msz.controllers.StudentController;
import com.msz.entities.Student;
import com.msz.services.StudentService;
import com.msz.views.MainMenu;
import com.msz.views.StudentMenu;

public class GetNew {

	public static MainMenu app() {
		return new MainMenu();
	}

	// public static Object menu(Object object) {
	// return ne
	// }

	public static StudentMenu studentMenu() {
		return new StudentMenu();
	}

	public static Student student() {
		return new Student();
	}

	public static StudentService studentService() {
		return new StudentService();
	}

	public static StudentController studentController() {
		return new StudentController();
	}

	public static Scanner scanner() {
		return new Scanner(System.in);
	}

}
