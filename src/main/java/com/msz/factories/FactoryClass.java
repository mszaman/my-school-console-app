package com.msz.factories;

import java.util.Scanner;

import com.msz.entities.Student;

public class FactoryClass {

	public static Student newStudent() {
		return new Student();
	}

	public static Scanner newScanner() {
		return new Scanner(System.in);
	}

}
