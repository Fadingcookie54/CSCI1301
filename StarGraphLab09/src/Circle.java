/*
* [Circle].java
* Author: [Zhizheng Wang]
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
* of source code at any time for this project is prohibited. */
//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {

	private String name; // declare the private String instance name
	private double radius; // declare the private double instance radius
	private double x; // declare the private double instance x
	private double y; // declare the private double instance y

	// Used to compare doubles. Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	// ----------------------------------------------
	// getName - returns the value of name
	// ----------------------------------------------
	public String getName() {
		return name;
		// Your code goes here
	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {
		return x;
		// Your code goes here
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {
		return y;
		// Your code goes here
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		return radius;
		// Your code goes here
	}

	// ----------------------------------------------
	// setName - assigns a new value to name
	// ----------------------------------------------
	public void setName(String name) {
		this.name = name;
		// Your code goes here
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double x) {
		this.x = x;
		// Your code goes here
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double y) {
		this.y = y;
		// Your code goes here
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
		// Your code goes here
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
		// Your code goes here
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
		// Your code goes here
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {
		double diameter = radius * 2;
		return diameter;
		// Your code goes here
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {
		if (radius == 1 && x == 0.0 && y == 0.0) {
			return true;
		} else {
			return false;
		}
		// Your code goes here
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {
		String circleCharacteristics = "name: " + name + "\ncenter:(" + x + "," + y + ")\nradius: " + radius;
		return circleCharacteristics;
		// Your code goes here
	}

	// myMethod
	//equals method This method returns true when the radius and centers of both circles are the same, or false otherwise.
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(this.getRadius() - anotherCircle.getRadius()) < THRESHOLD
				&& (Math.abs(this.getX() - anotherCircle.getX()) < THRESHOLD)
				&& (Math.abs(this.getY() - anotherCircle.getY()) < THRESHOLD)) {
			return true;
		} else {
			return false;
		}
	}
	//distance method This method returns the distance between the centers of the circle. Assume that (x, y) and (xa, ya) be the centers of two circles.
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt(Math.pow((anotherCircle.getX() - this.getX()), 2.0)
				+ Math.pow(anotherCircle.getY() - (this.getY()), 2.0));
		return distance;
	}
	//isSmaller method This method returns true when the circle executing the method (calling object) is smaller than the parameter (anotherCircle), false otherwise.
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}
	}
	//compareTo method
	public int compareTo(Circle anotherCircle) {
		if (this.area() > anotherCircle.area()) {
			return 1; // If the calling object is larger than anotherCircle, the method returns a positive value 1.
		} else if (this.area() < anotherCircle.area()) {
			return -1; // If the calling object is smaller than anotherCircle, the method returns a negative value -1.
		} else {
			return 0; // Otherwise, the method returns 0.
		}

	}
	//intersects method This method returns true when both circles have an intersecting area or a portion of the executing circle overlaps with anotherCircle. Otherwise, the method returns false.
	public boolean intersects(Circle anotherCircle) {
		double distance = Math.sqrt(Math.pow((anotherCircle.getX() - this.getX()), 2.0) + Math.pow(anotherCircle.getY() - (this.getY()), 2.0));
		if (distance < (this.radius + anotherCircle.radius)) {
			return true;
		} else { 
			return false;
		}
	}

} // end class Circle
