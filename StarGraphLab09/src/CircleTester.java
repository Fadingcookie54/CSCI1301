/*
* [CircleTester].java
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
* of source code at any time for this project is prohibited. 
*/

//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester {
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0);

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println(circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println(circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("\nCircle1\nDiameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("\nCircle2\nDiameter:" + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("\nIs circle1 a unit circle? " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Is circle2 a unit circle? " + circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.		
		System.out.println("\n--------------------------------");
		System.out.println("TEST CIRCLES");

		System.out.println("\n||equals() method||");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(1);
		//circle 1 and circle 2 are NOT the same 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 1 - Is circle 1 equals to circle 2: ");
		System.out.println(circle1.equals(circle2));

		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(3);
		circle2.setX(4.0);
		circle2.setY(0.0);
		circle2.setRadius(-1);
		//circle 1 and circle 2 are NOT the same 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 2 - Is circle 1 equals to circle 2: ");
		System.out.println(circle1.equals(circle2));

		circle1.setX(-5.0);
		circle1.setY(-1.0);
		circle1.setRadius(-5);
		circle2.setX(2.0);
		circle2.setY(-4.0);
		circle2.setRadius(1);
		//circle 1 and circle 2 are NOT the same 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 3 - Is circle 1 equals to circle 2: ");
		System.out.println(circle1.equals(circle2));

		System.out.println("\n||distance() method||");
		circle1.setX(5.0);
		circle1.setY(1.0);
		circle1.setRadius(5);
		circle2.setX(5.0);
		circle2.setY(1.0);
		circle2.setRadius(9);
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 1 - Distance between circle 1 to circle 2: ");
		System.out.println(circle1.distance(circle2));

		circle1.setX(5.0);
		circle1.setY(0.0);
		circle1.setRadius(5);
		circle2.setX(-5.0);
		circle2.setY(0.0);
		circle2.setRadius(3);
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 2 - Distance between circle 2 to circle 1: ");
		System.out.println(circle2.distance(circle1));

		circle1.setX(-5.0);
		circle1.setY(-8.0);
		circle1.setRadius(1);
		circle2.setX(-2.0);
		circle2.setY(8.0);
		circle2.setRadius(3);
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 3 - Distance between circle 2 to circle 1: ");
		System.out.println(circle2.distance(circle1));

		System.out.println("\n||isSmaller() method||");
		circle1.setX(-5.0);
		circle1.setY(-8.0);
		circle1.setRadius(4);
		circle2.setX(-2.0);
		circle2.setY(8.0);
		circle2.setRadius(2);
		//circle 1 IS NOT smaller than circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 1 - Is circle 1 smaller than circle 2? ");
		System.out.println(circle1.isSmaller(circle2));

		circle1.setX(5.0);
		circle1.setY(8.0);
		circle1.setRadius(1);
		circle2.setX(1.0);
		circle2.setY(-4.0);
		circle2.setRadius(9);
		//circle 1 IS smaller than circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 2 - Is circle 1 smaller than circle 2? ");
		System.out.println(circle1.isSmaller(circle2));

		circle1.setX(3.0);
		circle1.setY(1.0);
		circle1.setRadius(11);
		circle2.setX(4.0);
		circle2.setY(4.0);
		circle2.setRadius(-8);
		//circle 1 IS NOT smaller than circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 3 - Is circle 1 smaller than circle 2? ");
		System.out.println(circle1.isSmaller(circle2));

		System.out.println("\n||compareTo() method||");
		System.out.println("1: area is greater than, -1 area is less than, 0 are is equal to each other");

		circle1.setX(-2.0);
		circle1.setY(-1.0);
		circle1.setRadius(1);
		circle2.setX(-4.0);
		circle2.setY(0.0);
		circle2.setRadius(8);
		//circle 1 area is less than circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 1 - circle 1 to cirlce 2: ");
		System.out.println(circle1.compareTo(circle2));

		circle1.setX(-2.0);
		circle1.setY(-1.0);
		circle1.setRadius(1);
		circle2.setX(-4.0);
		circle2.setY(0.0);
		circle2.setRadius(8);
		//circle 1 area is greater than circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 2 - circle 2 to cirlce 1: ");
		System.out.println(circle2.compareTo(circle1));

		circle1.setX(2.0);
		circle1.setY(-1.0);
		circle1.setRadius(5);
		circle2.setX(-4.0);
		circle2.setY(-6.0);
		circle2.setRadius(5);
		//circle 1 area is same as circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 3 - circle 1 to cirlce 2: ");
		System.out.println(circle1.compareTo(circle2));

		System.out.println("\n||intersects() method||");
		circle1.setX(-4.0);
		circle1.setY(-3.0);
		circle1.setRadius(5);
		circle2.setX(-2.0);
		circle2.setY(0.0);
		circle2.setRadius(8);
		//circle 1 intersects with circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 1 - Does circle 1 intersects with cirlce 2: ");
		System.out.println(circle1.intersects(circle2));

		circle1.setX(-4.0);
		circle1.setY(-3.0);
		circle1.setRadius(1);
		circle2.setX(2.0);
		circle2.setY(0.0);
		circle2.setRadius(2);
		//circle 1 NOT intersects with circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 2 - Does circle 1 intersects with cirlce 2: ");
		System.out.println(circle1.intersects(circle2));

		circle1.setX(-4.0);
		circle1.setY(3.0);
		circle1.setRadius(-4);
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(2);
		//circle 1 intersects with circle 2 
		System.out.println("\ncircle1=" + circle1.toString());
		System.out.println("circle2=" + circle2.toString());
		System.out.print("CASE 3 - Does circle 2 intersects with cirlce 1: ");
		System.out.println(circle2.intersects(circle1));

	}

}
