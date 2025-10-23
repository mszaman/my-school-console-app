package com.msz.views;

import java.util.Scanner;

import com.msz.entities.Student;
import com.msz.interfaces.MenuInterface;

public class StudentMenu implements MenuInterface<Student, Scanner> {

	@Override
	public void showMenu(Student student, Scanner scanner) {
		int selectedMenuNumber;
		selectedMenuNumber = scanner.nextInt();

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("==================================================================");
			System.out.println("====================    Student Management    ====================");
			System.out.println("==================================================================");
			System.out.println();
			System.out.println();
			System.out.println("1. Add New Student");
			System.out.println("2. Show All Students");
			System.out.println("3. Show Single Student");
			System.out.println("0. Back");
			System.out.print("Press a number mentioned above for respective action (1/2/3): ");

			switch (selectedMenuNumber) {
				case 1:
					this.setInfo(student, scanner);
					break;

				default:
					break;
			}

		}
	}

	private Student setInfo(Student student, Scanner scanner) {
		while (true) {
			System.out.println("Enter Student Name: ");
			student.setSutdentName(scanner.nextLine());

			System.out.println("Enter Student Age: ");
			student.setStudentAge(scanner.nextInt());

			System.out.println();
			System.out.println("Student is added.");
			System.out.print("Do you would like add another student?(y/N): ");
			String str = scanner.nextLine();
			if (str == "N" || str == "n" || str == "") {
				break;
			}

		}
		return student;
	}

}
