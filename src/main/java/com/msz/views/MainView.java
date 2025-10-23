package com.msz.views;

import java.util.Scanner;

public class MainView {

	private Scanner scanner = new Scanner(System.in);

	public void showMenu() {
		int selectedMenuNumber;

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("==================================================================");
		System.out.println("Welcome to My School App");
		System.out.println("==================================================================");
		System.out.println();
		System.out.println();
		System.out.println("1. Student Manage");
		System.out.println("2. Teacher Manage");
		System.out.println("3. Course Manage");
		System.out.println("0. Exit");
		System.out.print("Press a number mentioned above for respective action (1/2/3): ");

		// TODO: while loop

		try {
			while (true) {
				selectedMenuNumber = scanner.nextInt();
				if (selectedMenuNumber == 0) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Enter a valid number - 1 or 2 or 3 or");
		}

		// StudentService std = new StudentService();
		// System.out.println(std.save(null, null));

		System.out.println();
		System.out.println();
		System.out.println("==================================================================");
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
