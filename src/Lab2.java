/*
 * Lab 2, Challenges completed
 * 
 */

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char keepGoing = 'y';
		int userNum;
		String userName;

		// Personalize the messages with a name
		System.out.println("What is your nickname? ");
		userName = scan.nextLine();

		while ((keepGoing == 'y') || (keepGoing == 'Y')) {
			System.out.print("\n" + userName + ", " + "Enter a number between 1 and 100: ");

			// Check that a number was entered
			if (scan.hasNextInt()) {
				userNum = scan.nextInt();
			} else {
				System.out.println("\n" + userName + ", " + "That is an invalid selection, you did not enter a number");
				break;
			}

			// Check that the number is within range
			if ((userNum < 1) || (userNum > 100)) {
				System.out.println("\n" + userName + ", " + "That is an invalid selection, your number is negative!");
				break;
			}

			// Check conditions to determine output (based on problem statement)
			System.out.print(userName + ", " + "Your output is: ");
			if (userNum % 2 != 0) {
				System.out.print(userNum + " and Odd");
				if (userNum > 60) {
					System.out.print(" and over 60");
				}
			} else if (userNum < 25) {
				System.out.print("Even and less than 25");
			} else {
				if (userNum > 60) {
					System.out.print(userNum + " and ");
				}
				System.out.print("Even");
			}

			// Prompt the user to continue
			System.out.print("\n\n" + userName + ", " + "Would you like to continue? (y/n): ");
			keepGoing = scan.next().charAt(0);

		}
		
		// Final statement signifying end of program
		System.out.println("\n" + userName + ", " + "Thanks for playing, Goodbye.");
		scan.close();

	}

}
