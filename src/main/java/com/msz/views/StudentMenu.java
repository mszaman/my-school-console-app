package com.msz.views;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.msz.entities.Student;
import com.msz.factory.GetNew;
import com.msz.interfaces.MenuInterface;

public class StudentMenu implements MenuInterface {

	@Override
	public void showMenu(Scanner scanner) {
		int selectedMenuNumber;

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("==================================================================");
		System.out.println("====================    Student Management    ====================");
		System.out.println("==================================================================");
		System.out.println();
		System.out.println();
		System.out.println();

		while (true) {

			try {
				this.menuContent();

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
						this.sendRequest(scanner);
						break;
					default:
						break;
				}
			} catch (Exception e) {
				this.invalidMenuChoice();
				scanner.next();
			}

		}

		System.out.println();
		System.out.println();
		System.out.println("==================================================================");
		System.out.println();
		System.out.println();
	}

	private void sendRequest(Scanner scanner) {

		while (true) {

			try {
				String studentName;
				int studentAge;
				String str;

				System.out.println();
				System.out.println();
				System.out.print("Enter Student Name: ");
				studentName = scanner.next();

				try {
					System.out.print("Enter Student Age: ");
					studentAge = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Invalid Input. Age must be an integer.");
					scanner.next();
					continue;
				}

				GetNew.studentController().saveStudent(studentName, studentAge);

				System.out.println();
				System.out.println("Student is added.");
				// try {
				// System.out.print("Would you like to add another student?(y/N): ");
				// str = scanner.next();
				// if (str.equals("n") || str.equals("N") || str.equals("")) {
				// // System.out.println(str == "" ? "*" : str);
				// break;
				// } else if (str.equals("y") || str.equals("Y")) {
				// continue;
				// } else {
				// System.out.println("Invalid Input.");
				// scanner.next();
				// continue;
				// }
				// } catch (Exception e) {
				// System.out.println(e);
				// }
				System.out.println();
				System.out.println();
				break;

			} catch (Exception e) {

				this.invalidMenuChoice();
				scanner.next();
				continue;
			}

		}
	}

	private void menuContent() {
		System.out.println("======================");
		System.out.println("==== Student Menu ====");
		System.out.println("======================");
		System.out.println();
		System.out.println("1. Add New Student");
		System.out.println("2. Show All Students");
		System.out.println("3. Show Single Student");
		System.out.println("0. Back");
		System.out.print("Press a number mentioned above for respective action (1/2/3): ");
	}

	private void invalidMenuChoice() {
		System.out.println();
		System.out.println();
		System.out.println("Invalid menu choice. Enter 1, 2, 3, or 0 to back.");
		System.out.println();
		System.out.println();
	}

}
