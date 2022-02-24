/*
* FindTheSums.java
* Author: Zhizheng Wang
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting
* of source code at any time for this project is prohibited. 
*/
public class FindTheSums {
	public static String arrayToString(int[][] a) {
		String arrayToString = "";
		for (int row = 0; row < a.length; row++) { // row
			for (int col = 0; col < a[0].length; col++) { // col
				arrayToString += a[row][col];
				if (col < a[0].length - 1) {
					arrayToString += " "; // add space after each value
				}
			} // end for loop for col
			if (row < a.length - 1) {
				arrayToString += "\n"; // switch to next line after each row
			}
		} // end for loop for row
		return arrayToString;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] array = new int[a.length][a[0].length];
		for (int row = 0; row < a.length; row++) { // rows
			for (int col = 0; col < a[0].length; col++) { // col
				int sum = 0;
				int counter = 0;
				for (int i = col; i < a[0].length; i++) {
					if (sum < sumToFind) {
						sum += a[row][i]; // add value to sum
						counter++;
					}
				}
				if (sum == sumToFind) { // check see if sum == to sumTofind
					for (int j = 0; j < counter; j++) {
						array[row][col + j] = a[row][col + j];
					}
				}
			} // end for loop for col
		} // end for loop for row
		return array;
	} // end of class horizontalSums

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] array = new int[a.length][a[0].length];
		for (int col = 0; col < a.length; col++) { // col
			for (int row = 0; row < a.length; row++) { // row
				int sum = 0;
				int counter = 0;
				for (int i = row; i < a.length; i++) {
					if (sum < sumToFind) {
						sum += a[i][col]; // add value to sum
						counter++;
					}
				}
				if (sum == sumToFind) { // check see if sum == to sumTofind
					for (int j = 0; j < counter; j++) {
						array[row + j][col] = a[row + j][col];
					}
				} // end if statement (sumToFind)
			} // end for loop for row
		} // end for loop for col
		return array;
	} // end of class verticalSums
} // end of class FindTheSums
