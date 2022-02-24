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
		data = new double[0];
	}

	public Stat(double[] d) { // Stat method
		if (d != null) { // check if null
			data = new double[d.length];
			for (int i = 0; i < d.length; i++) { // assign variables
				data[i] = d[i];
			}
		} else {
			data = new double[0]; // if null make the array back to empty 
		}
	}

	public Stat(float[] f) {
		if (f != null) { // check if null
			data = new double[f.length];
			for (int i = 0; i < f.length; i++) { // assign variables
				data[i] = f[i];
			}
		} else {
			data = new double[0];
		}
	}

	public Stat(int[] i) {
		if (i != null) { // check if null
			data = new double[i.length];
			for (int j = 0; j < i.length; j++) { // assign variables
				data[j] = i[j];
			}
		} else {
			data = new double[0];
		}

	}

	public Stat(long[] lo) {
		if (lo != null) { // check if null
			data = new double[lo.length];
			for (int i = 0; i < lo.length; i++) { // assign variables
				data[i] = lo[i];
			}
		} else {
			data = new double[0];
		}
	}

	public void setData(float[] f) {
		if (f != null) { // check if null
			data = new double[f.length];
			for (int i = 0; i < f.length; i++) { // assign variables
				data[i] = f[i];
			}
		} else {
			data = new double[0];
		}
	}

	public void setData(double[] d) { // set data method
		if (d != null) { // check null
			data = new double[d.length];
			for (int i = 0; i < d.length; i++) { // assign variables
				data[i] = d[i];
			}
		} else {
			data = new double[0];
		}
	}

	public void setData(int[] i) {
		if (i != null) { // check null
			data = new double[i.length];
			for (int j = 0; j < i.length; j++) { // assign variables
				data[j] = i[j];
			}
		} else {
			data = new double[0];
		}
	}

	public void setData(long[] lo) {
		if (lo != null) { // check null
			data = new double[lo.length];
			for (int i = 0; i < lo.length; i++) { // assign variables
				data[i] = lo[i];
			}
		} else {
			data = new double[0];
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

	public boolean equals(Stat s) { // compare if two arrays are the same or not
		boolean equals = false;
		if (s != null) { // check null
			if (s.data.length == data.length) { // check length
				for (int i = 0; i < s.data.length; i++) {
					if (s.data[i] == data[i]) { // compare
						equals = true; // if same return true
					}
				}
			}
		}
		return equals;
	}

	public void reset() {
		data = new double[0]; // reset to original
	}

	public void append(int[] i) { // get data from newData
		if (i != null) { // check null
			double[] append = new double[data.length + i.length];
			for (int j = 0; j < append.length; j++) {
				if (j < data.length) {
					append[j] = data[j];
				} else {
					append[j] = i[j - data.length];
				}
			}
			data = append;
		}
	}

	public void append(float[] f) { // get data from newData
		if (f != null) { // check null
			double[] append = new double[data.length + f.length];
			for (int i = 0; i < append.length; i++) {
				if (i < data.length) {
					append[i] = data[i]; // set first part of append 
				} else {
					append[i] = f[i - data.length]; // set second part of append 
				}
			}
			data = append;

		}
	}

	public void append(long[] lo) { // get data from newData
		if (lo != null) { // check null
			double[] append = new double[data.length + lo.length];
			for (int i = 0; i < append.length; i++) {
				if (i < data.length) {
					append[i] = data[i]; // set first part of append 
				} else {
					append[i] = lo[i - data.length]; // set second part of append 
				}
			}
			data = append;

		}
	}

	public void append(double[] d) { // get data from newData
		if (d != null) { // check null
			double[] append = new double[data.length + d.length];
			for (int i = 0; i < append.length; i++) {
				if (i < data.length) {
					append[i] = data[i]; // set first part of append 
				} else {
					append[i] = d[i - data.length];  // set second part of append 
				}
			}
			data = append;
		}
	}

	public boolean isEmpty() { // get data from newData
		boolean isEmpty = true;
		if (data.length > 0) { // if great than 0 then is NOT empty
			isEmpty = false;
		}
		return isEmpty;
	}

	public String toString() { // convert data to a string (format: [ , ])
		String toString;
		int counter = 0;
		toString = "[";
		if (data.length <= 0) {
			toString = "[]";
			return toString;
		}
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
		double min = Double.MAX_VALUE;
		if (data.length <= 0) {
			return Double.NaN;
		}
		for (int i = 0; i < data.length; i++) { // compare every value
			if (data[i] < min) {
				min = data[i]; // if val is smaller set that val as min val
			}
		}
		return min;
	}

	public double max() { // find max val in an array
		double max = Double.MIN_VALUE;
		if (data.length <= 0) {
			return Double.NaN;
		}
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
		if (data.length <= 0) {
			return Double.NaN;
		}
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
			} else if (maxAppaer == appear) {
				mode = Double.NaN;
			}

		} // i loop check every single var
		return mode;
	}

	private int occursNumberOfTimes(double value) {
		int occursNumberOfTimes = 0; 
		for (int i = 0; i < data.length; i++) { // check every val
			double update = data[i];
			if (update == value) { // check how many time that var occurs;
				occursNumberOfTimes++;
			}
		}
		return occursNumberOfTimes;
	}

	public double variance() {
		double variance = 0;
		if (data.length <= 0) {
			variance = Double.NaN;
		}
		double counter = 0;
		for (int i = 0; i < data.length; i++) { 
			counter = counter + Math.pow((data[i] - average()), 2); // find the num to avg 
		}
		variance = counter / data.length; // formula for variance
		return variance;
	}

	public double standardDeviation() {
		double standardDeviation;
		if (data.length <= 0) {
			standardDeviation = Double.NaN;
		} else {
			standardDeviation = Math.sqrt(variance()); // formula for stan. Dev.
		}
		return standardDeviation;
	}

} // end of class Stat