/*
* [StarGraph].java
* Author: [Zhizheng Wang]
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance, * or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting * of source code at any time for this project is prohibited.
*/
import java.util.Scanner;
import java.lang.Math;
public class StarGraph {

	public static void main(String[] args) {
		// declare scanner 
		Scanner stdin = new Scanner (System.in);
		//declare variable 
		int sizeOfX;
		double minValue;
		double increment;
		//Arrays
		double[] x; 
		double[] y;

		System.out.print("Please enter the number of x values to process: ");
		sizeOfX = stdin.nextInt(); // user input sizeOfX
		stdin.nextLine();
		if (sizeOfX <= 0) { // check in the size of x is in range or not
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		} else {
			System.out.print("Enter a minimum value for x: ");
			minValue = stdin.nextDouble(); //user input min value
			stdin.nextLine();
		
			System.out.print("Enter the amount to increment x: ");
			increment = stdin.nextDouble(); // user input increment
			stdin.nextLine();
			if (increment <= 0.0) { // check the range of increment
				System.out.println("The increment must be a decimal number greater than 0.");
				System.exit(0);
			}
			stdin.close();
			// Set array length to sizeOfX
			x = new double[sizeOfX];
			y = new double[sizeOfX];
			x[0] = minValue;
			System.out.println();
			//Calculation for x & y (for loops)
			for (int j = 1; j < sizeOfX; j++) {
				x[j] = x[j-1] + increment;
			}
			for (int j = 0; j < sizeOfX; j++) {
				y[j] = 20.0 * Math.abs(Math.sin(x[j]));
			}
			// print statements x and y
			System.out.println("Values");
			for (int i = 0; i < sizeOfX; i++) {
				System.out.printf("x: %1.3f, y: %1.3f\n", x[i], y[i]); // format to 3 decimals 
			}
			System.out.println();
			// draw graph
			System.out.println("Graph");
			for (int j = 0; j < sizeOfX; j++) {
				System.out.print(":");
				for (int k = 0; k < (int)y[j]; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		}// end of else 
		
	} // end of main class

} // end of Star Graph class
