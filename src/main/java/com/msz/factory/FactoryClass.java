package com.msz.factory;

import java.util.Scanner;

import com.msz.entities.Student;
import com.msz.views.MainView;

public class FactoryClass {

	public static MainView runProgram() {
		return new MainView();
	}

	public static Student newStudent() {
		return new Student();
	}

	public static Scanner newScanner() {
		return new Scanner(System.in);
	}

}
