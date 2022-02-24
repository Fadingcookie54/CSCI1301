/*
* [PayoffDebt].java
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

public class PayoffDebt {

	public static void main(String[] args) {
		
		//Scanner for User Input
	    Scanner stdin = new Scanner(System.in);
	    
	    //declare variables
	    double principal;
	    double annualInterestRate;
	    double monthlyPayment; 
	    
	    double monthsNeededToPayOff;
	    double totalAmountPaid;
	    double totalInterestPaid;
	    double noCeilPaid; // before rounding up 
	    double overpayment; 
	    
	    //User input 
	    System.out.print("Principal: \t\t\t");
	    	principal = stdin.nextDouble();
	    System.out.print("Annual Interest Rate(%): \t");
	    	annualInterestRate = stdin.nextDouble();
	    System.out.print("Monthly Payment: \t\t");
	    	monthlyPayment = stdin.nextDouble(); 
	    	
	    //Calculations
	    monthsNeededToPayOff = ((Math.log(monthlyPayment)) - (Math.log(monthlyPayment - (annualInterestRate/1200.0)* principal)))/(Math.log((annualInterestRate/1200.00)+1.0));	    
	   
	    totalAmountPaid = monthsNeededToPayOff * monthlyPayment;
	    noCeilPaid = totalAmountPaid;
	    
	    monthsNeededToPayOff = (int)Math.ceil(monthsNeededToPayOff);
	    totalAmountPaid = monthsNeededToPayOff * monthlyPayment;
	    totalInterestPaid = totalAmountPaid - principal;
	    
	    overpayment = totalAmountPaid - noCeilPaid;
	    stdin.close();
	    
	    // Print statements 
	    System.out.printf("\nMonths Needed To Pay Off: \t%.0f\n", monthsNeededToPayOff);
	    System.out.printf("Total Amount Paid: \t\t$%.2f\n", totalAmountPaid);
	    System.out.printf("Total Interest Paid: \t\t$%.2f\n", totalInterestPaid);
	    System.out.printf("Overpayment: \t\t\t$%.2f\n", overpayment);
	    
	}//end of class main

}//end of class PayOffDebt
