/*
* [NetPay].java
* Author: [Zhizheng Wang]
* Statement of Academic Honesty:
*
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

import java.util.Scanner;

public class NetPay {
	
	//declare & assign constants variables
	public static double FEDERAL_TAX_PERCENT = 10.00;
	public static double STATE_TAX_PERCENT = 4.5;
	public static double SOCIAL_SECURITY_PERCENT = 6.2;
	public static double MEDICARE_PERCENT = 1.45;
	public static double PAY_PER_HOUR = 7.25;

	public static void main(String[] args) {
		
		//scanner for user input 
	    Scanner stdin = new Scanner(System.in);
	    
        //declare variables
		double hoursPerWeek; 
		double grossPay;
		double netPay;
		
		double deductions;
		double federal;
		double state;
		double socialSecurity;
		double medicare; 
		
		//user input
		System.out.print("Hours per Weeks: \t" );
		hoursPerWeek = stdin.nextInt();
		
		//calculations
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federal = grossPay * (FEDERAL_TAX_PERCENT / 100);
		state = grossPay * (STATE_TAX_PERCENT / 100);
		socialSecurity = grossPay * (SOCIAL_SECURITY_PERCENT / 100);
		medicare = grossPay * (MEDICARE_PERCENT / 100);
		deductions = federal + state + socialSecurity + medicare;
		netPay = grossPay - deductions;
	
	    //print statements
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay + "\n");
		System.out.println("Deductions" );
		System.out.println("Federal: \t\t" + federal);
		System.out.println("State: \t\t\t" + state);
		System.out.println("Social Security: \t" + socialSecurity);
		System.out.println("Medicare: \t\t" + medicare);
		
	} // end of class main
	
} // end of class NetPay
