/*
 * [TemperatureConverter].java
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

/**
 *
 * File name: TemperatureConverter.java
 *
 *This program does the following:
 *Prompts the user to enter a temperature in Fahrenheit and a
 *temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
 *the temperature scale are valid, the program converts the temperature in Fahrenheit to 
 *the specified temperature scale and displays the converted value.
 *
*/

import java.util.Scanner;

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare the variables. 
 
	 double fahrenheit;
	 double convertedDegrees;
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
 
	 // Verify the user's input
	 if (fahrenheit <= MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here // fix condition and syntax 
		 System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
		 System.exit(0);
	 }
 
	 System.out.print (
			 "Enter the temperature scales you want to convert to:\n"+ 
			 "1. Kelvin \n"+
			 "2. Rankine \n"+
			 "3. Reaumur \n"+
			 "4. Celsius\n"+
			 "Enter a temperature scale: ");
	 tempScale = keyboard.nextInt();
	 
	 if (tempScale < 1 || tempScale > 4) {  // Second-if statement: Set a breakpoint here // fix condition 
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT) * 5/9; // fix formula 
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2) {  // fix condition
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  // fix formula
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) {  // fix condition 
			 convertedDegrees = (fahrenheit - 32) * 4/9 ; // Set a breakpoint here // fix formula 
			 tempScaleStr="Reaumur";
				 
		 } else {
			 convertedDegrees = (fahrenheit - 32) * 5/9; // Set a breakpoint here // fix formula 
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
		 keyboard.close();
	 }
 } //end of class main
} //end of class TemperatureConverter