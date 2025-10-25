package com.msz.views;

import java.util.Scanner;

import com.msz.factory.Factory;

public class MainMenu {

	private Scanner scanner = new Scanner(System.in);

	public void init() {
		int selectedMenuNumber;

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("==================================================================");
		System.out.println("Welcome to My School App");
		System.out.println("==================================================================");
		System.out.println();
		System.out.println();
		System.out.println();

		while (true) {
			this.menuContent();
			try {
				selectedMenuNumber = scanner.nextInt();

				if (selectedMenuNumber < 0 || selectedMenuNumber > 3) {
					this.invalidMenuChoice();
					continue;
				}

				if (selectedMenuNumber == 0) {
					break;
				}

				switch (selectedMenuNumber) {
					case 1:
						Factory.studentMenu().showMenu(scanner);
						break;

					default:
						break;
				}

			} catch (Exception e) {
				this.invalidMenuChoice();
				scanner.next();
				continue;
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("==================================================================");
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private void menuContent() {
		System.out.println("===================");
		System.out.println("==== Main Menu ====");
		System.out.println("===================");
		System.out.println();
		System.out.println("1. Student Manage");
		System.out.println("2. Teacher Manage");
		System.out.println("3. Course Manage");
		System.out.println("0. Exit");
		System.out.print("Press a number mentioned above for respective action (1/2/3/0): ");
	}

	private void invalidMenuChoice() {
		System.out.println();
		System.out.println();
		System.out.println("Invalid menu choice. Enter 1, 2, 3, or 0 to exit.");
		System.out.println();
		System.out.println();
	}
}
