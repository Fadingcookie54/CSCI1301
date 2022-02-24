/*
* [ClassifyMessage].java
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

public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		//scanner
		Scanner stdin = new Scanner(System.in);
		//declare variables 
		String catString; // The raw text of the message’s category
		String payload; // The primary content of the message
		double latitude; // The primary content of the message
		double longitude; // The longitude indicated in the message
		boolean isInRange; // The value that indicates if the location is in range
		MessageCategory category; // The message’s category
		
		double south = 39.882343; // southernmost latitude
		double north = 40.231315; // northernmost latitude
		double west = -105.743511; // westernmost longitude
		double east = -104.907864; // easternmost longitude
		
		//user input
		System.out.println("Please enter a formatted message: ");
			catString = stdin.next();
			latitude = stdin.nextDouble();
			longitude = stdin.nextDouble();
			payload = stdin.nextLine();
		payload = payload.trim();
		stdin.close();
		
		if (catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke")){
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")){
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}

		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east ){
			isInRange = true;
		} else {
			isInRange = false;
		}
		//Print to terminal 
		System.out.println("Category:\t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t " + payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);

	} //end of class main

} //end of class ClassifyMessage
