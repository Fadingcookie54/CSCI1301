
/*
* [DrawingShapes].java
* Author: [Zhizheng]
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting * of source code at any time for this project is prohibited.
*/
import java.util.Scanner;

public class DrawingShapes {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String shape;
		int length;
		int height;
		String star = "*";

		System.out.println("Enter a shape: r t h o p");
		shape = stdin.nextLine();
		// check user shape input
		if (shape.equals("r") || shape.equals("t") || shape.equals("h") || shape.equals("o") || shape.equals("p")) {
			// rectangle
			if (shape.equals("r")) {
				System.out.println("Enter a length");
				length = stdin.nextInt();
				if (length > 1) {
					System.out.println("Enter a height");
					height = stdin.nextInt();
					if (height > 1) {
						System.out.println("Bewlow is a " + length + " by " + height + " rectangle of *");
						for (int j = 0; j < height; j++) { // draw rec
							for (int k = 0; k < length; k++) {
								System.out.print(star);
							}
							System.out.println();
						}
					} else { // else for invalid height
						System.out.println("Height must be greater than 1\n" + "Goodbye!");
						System.exit(0);
					}
				} else { // else for invalid length
					System.out.println("Length must be greater than 1\n" + "Goodbye!");
					System.exit(0);
				}
			} else if (shape.equals("t")) {
				// triangle
				System.out.println("Enter a length");
				length = stdin.nextInt();
				if (length > 1) { // check length condition
					System.out.println("Below is a triangle with two side lengths of " + length + " *");
					for (int j = 1; j <= length; j++) {
						for (int k = (length - j); k >= 1; k--) {
							System.out.print(" ");
						}
						for (int i = 1; i <= (j * 2) - 1; i++) {
							System.out.print(star);
						}
						System.out.println();
					}
				} else { // else for invalid length
					System.out.println("Length must be greater than 1\n" + "Goodbye!");
					System.exit(0);
				}
			} else if (shape.equals("h")) {
				// hexagon
				System.out.println("Enter a length");
				length = stdin.nextInt();
				if (length > 1) { // check length condition
					System.out.println("Below is a hexagon with side lengths of " + length + " *");
					int c = length;
					for (int j = 1; j <= length; j++) { // draw top part
						for (int k = (length - j); k >= 1; k--) {
							System.out.print(" ");
						}
						for (int i = 1; i <= c; i++) {
							System.out.print(star);
						}
						c = c + 2;
						System.out.println();
					}
					for (int j = length - 1; j >= 1; j--) { // draw bottom part
						for (int k = (length - j); k >= 1; k--) {
							System.out.print(" ");
						}
						for (int i = c - 3; i > 1; i--) {
							System.out.print(star);
						}
						c = c - 2;
						System.out.println();
					}
				} else { // else for invalid length
					System.out.println("Length must be greater than 1\n" + "Goodbye!");
					System.exit(0);
				}

			} else if (shape.equals("o")) {
				// octagon
				System.out.println("Enter a length");
				length = stdin.nextInt();
				if (length > 1) { // check length condition
					System.out.println("Below is a octagon with side lengths of " + length + " *");
					int c = length;
					for (int j = 1; j <= length; j++) { // draw top part
						for (int k = (length - j); k >= 1; k--) {
							System.out.print(" ");
						}
						for (int i = 1; i <= c; i++) {
							System.out.print(star);
						}
						c = c + 2;
						System.out.println();
					}
					for (int j = 0; j < length - 1; j++) { // draw middle part
						for (int k = 0; k < c - 2; k++) {
							System.out.print(star);
						}
						System.out.println();
					}
					for (int j = length - 1; j >= 1; j--) { // draw bottom part
						for (int k = (length - j); k >= 1; k--) {
							System.out.print(" ");
						}
						for (int i = c - 3; i > 1; i--) {
							System.out.print(star);
						}
						c = c - 2;
						System.out.println();
					}
				} else {
					System.out.println("Length must be greater than 1\n" + "Goodbye!");
					System.exit(0);
				}

			} else if (shape.equals("p")) {
				// pentagon
				System.out.println("Enter a length");
				length = stdin.nextInt();
				if (length > 1) { // check length condition
					System.out.println("Below is a pentagon with 4 side lengths of " + length + " *");
					int c = length;
					for (int j = 1; j <= length; j++) { // draw top part
						for (int k = (length - j); k >= 1; k--) {
							System.out.print(" ");
						}
						for (int i = 1; i <= (j * 2) - 1; i++) {
							System.out.print(star);
							c = (j * 2) - 1;
						}
						System.out.println();
					}
					for (int j = 0; j < length - 1; j++) { // draw bottom part
						for (int k = 0; k < c; k++) {
							System.out.print(star);
						}
						System.out.println();
					}
				} else { // else for invalid length
					System.out.println("Length must be greater than 1\n" + "Goodbye!");
					System.exit(0);
				}
			}
			stdin.close(); // close scanner for user input
		} else { // else statement for user shape input
			System.out.println("Invalid shape\n" + "Goodbye!");
		}

	} // end of class main

} // end of class DrawingShapes