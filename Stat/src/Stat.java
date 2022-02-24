/*
* Stat.java
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
public class Stat {
	// declare variables
	private double[] data;

	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}

	public Stat(double[] d) { // Stat method
		data = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}

	public double[] getData() { // get data from newData
		double[] newData;
		newData = new double[data.length]; // creating a copy of the original array
		for (int i = 0; i < data.length; i++) { // put data into the copy array
			newData[i] = data[i];
		}
		return newData;
	}

	public void setData(double[] d) { // set data method
		data = new double[d.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = d[i]; // assign value to arrays
		}
	}

	public boolean equals(Stat s) { // compare if two arrays are the same or not
		boolean equals = false;
		if (s.data.length == data.length) {
			for (int i = 0; i < s.data.length; i++) {
				if (s.data[i] == data[i]) {
					equals = true; // if same return true
				}
			}
		}
		return equals;
	}

	public String toString() { // convert data to a string (format: [ , ])
		String toString;
		int counter = 0;

		toString = "[";
		for (int i = 0; i < data.length - 1; i++) { // run through every value
			toString = toString + data[i];
			if (counter == i) {
				toString = toString + ", ";
			}
			counter++;
		}
		toString = toString + data[data.length - 1] + "]"; // concat values into -> [,]
		return toString;
	}

	public double min() { // find the min val in an array
		double min = data[0];
		for (int i = 0; i < data.length; i++) { // compare every value
			if (data[i] < min) {
				min = data[i]; // if val is smaller set that val as min val
			}
		}
		return min;
	}

	public double max() { // find max val in an array
		double max = data[0];
		for (int i = 0; i < data.length; i++) { // compare every value
			if (data[i] > max) {
				max = data[i]; // if val is larger set that val as max val
			}
		}
		return max;
	}

	public double average() { // find avg in an array
		double average = 0;
		for (int i = 0; i < data.length; i++) {
			average = data[i] + average; // add all value
		}
		average = average / data.length; // divide with the number of val
		return average;
	}

	public double mode() { // find the mode in an array
		double mode = data[0];
		int maxAppaer = 0; //
		for (int i = 0; i < data.length; i++) { // check every val
			int appear = 0;
			for (int j = i; j < data.length; j++) {
				if (data[j] == data[i]) {
					appear++;
				}
			} // j loop check how many time that var appears;
			if (data.length == 1) {
				mode = data[0];
			}
			if (appear > maxAppaer) {
				maxAppaer = appear;
				mode = data[i];
			} else if (maxAppaer == appear){
				mode = Double.NaN;
			}

		} // i loop check every single var
		return mode;

	}

} // end of class Stat