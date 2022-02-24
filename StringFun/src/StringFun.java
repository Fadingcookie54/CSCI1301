/*
* [StringFun].java
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
import java.util.Scanner;

public class StringFun {
	
	public static void main(String[] args) {
		//import Scanner
		Scanner stdin = new Scanner(System.in);
		//declare and assign variables, 
		String userString;
		String newString = "";
		String userCommand;
		char replaceChar;
		char newChar; 
		char removeChar;
		int numRemove;
		boolean quit = false; 
		boolean dne = true; // do not exits 
		String dneMsg = "The letter was not found in the word";
		String errorMsg = "Error: the letter you are trying to remove does not exist";
		
		System.out.println("Enter the String to be manipulated"); // ask user for string input
		userString = stdin.nextLine();
		
		while(!quit) { // check if user want to quit or not
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			userCommand = stdin.nextLine(); // take user command
			if (userCommand.equalsIgnoreCase("reverse")) {
				//Reverse
				for (int index = userString.length() - 1; index >= 0; index--) {
					newString += userString.charAt(index); // print char from back to front 
				}
				System.out.println("The new sentence is: " + newString);
				userString = newString; // reset string
				newString = "";

			} else if (userCommand.equalsIgnoreCase("replace first")){
				//Replace First
				System.out.println("Enter the character to replace");
				replaceChar = stdin.nextLine().charAt(0);
				System.out.println("Enter the new character");
				newChar = stdin.nextLine().charAt(0);
				for (int index = 0; index < userString.length(); index++) { // check char from front to back
					if (replaceChar == userString.charAt(index)) {
						newString = userString.substring(0,index) + newChar + userString.substring(index+1);
						index = userString.length(); // break out of index
						dne = false; 
					} 
				}
				if (dne == true) { // check dne
					System.out.println(dneMsg);
				} else {
					System.out.println("The new sentence is: " + newString);
					userString = newString; // reset string
					newString = "";
				}
				
			} else if (userCommand.equalsIgnoreCase("replace last")){ // check char from back to front
				//Replace Last
				System.out.println("Enter the character to replace"); // user input char want to replace
				replaceChar = stdin.nextLine().charAt(0);
				System.out.println("Enter the new character"); // user input new char to replace old char
				newChar = stdin.nextLine().charAt(0);
				for (int index = userString.length() - 1; index >= 0; index--) {
					if (replaceChar == userString.charAt(index)) {
						newString = userString.substring(0,index) + newChar + userString.substring(index+1);
						index = -1; // break out of index
						dne = false; 
					} 
				}
				if (dne == true) { //check dne
					System.out.println(dneMsg);
				} else {
					System.out.println("The new sentence is: " + newString);
					userString = newString; //reset string
					newString = "";
				}

				
			} else if (userCommand.equalsIgnoreCase("remove all")){
				//Remove All
				System.out.println("Enter the character to remove "); // user input char want to remove
				removeChar = stdin.nextLine().charAt(0);
				for (int index = 0; index < userString.length(); index++) {
					if (userString.charAt(index) != removeChar ){ // check char with remove char 
						newString += userString.charAt(index);
						dne = false;
					}
				} 
				if (dne == true) { // check error
					System.out.println(errorMsg);
				} else {
					System.out.println("The new sentence is: " + newString);
					userString = newString; // reset string
					newString = "";
				}

				
			} else if (userCommand.equalsIgnoreCase("remove")){
				//Remove
				System.out.println("Enter the character to remove "); // user input char want to remove
				removeChar = stdin.nextLine().charAt(0);
				System.out.println("Enter the " + removeChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.): "); // user input # of char occur in string
				numRemove = stdin.nextInt();
				stdin.nextLine();
				int counter = 0;			
				for (int index = 0; index < userString.length(); index++) {
					if (userString.charAt(index) == removeChar) {
						counter++; // count # of time char occur 
						if (counter == numRemove) {
							newString = userString.substring(0,index) + userString.substring(index + 1);
							dne = false;
						} else if (counter < numRemove) { // when char is out of range
							dne = true;
						} 
					} 

				} 
				if (dne == true) { // check error
					System.out.println(errorMsg);
				} else {
					System.out.println("The new sentence is: " + newString);
					userString = newString; // rest string
					newString = "";
				}
				
			} else if (userCommand.equalsIgnoreCase("quit")) {
				quit = true; // stop loop
			}
		}	// end of while quit loop	
		stdin.close(); // close scanner 
	} // end of class main

}// end of class StringFun
