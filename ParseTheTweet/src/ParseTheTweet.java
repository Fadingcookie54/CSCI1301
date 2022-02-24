/*
* [ParseTheTweet].java
* Author: [Zhizheng wang]
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

public class ParseTheTweet {

	public static void main(String[] args) {
		//scanner
		Scanner stdin = new Scanner(System.in);
		//user input 
		System.out.println("Enter a tweet below");
		String tweet = stdin.nextLine();
		//declare variables 
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		 	//type
			int iStart = tweet.indexOf("#") + 5; //index start point
			int iEnd = tweet.indexOf(";"); //index end point
			type = tweet.substring(iStart,iEnd);
			String typeOriginal = type;
			String typeTrimmed = typeOriginal.trim();
			typeTrimmed = typeTrimmed.toUpperCase();
			//detail
			tweet = tweet.substring(iEnd + 1);
			iEnd = tweet.indexOf(";");
			detail = tweet.substring(iStart,iEnd);
			String detailOriginal = detail;
			String detailTrimmed = detailOriginal.trim();
			detailTrimmed = detailTrimmed.replace(',', '-');
			//location
			tweet = tweet.substring(iEnd + 1);
			iEnd = tweet.indexOf(";");
			location = tweet.substring(iStart,iEnd);
			String locationOriginal = location;
			String locationTrimmed = locationOriginal.trim();
			locationTrimmed = locationTrimmed.replace(',', '-');
			//latitude
			tweet = tweet.substring(iEnd + 1);
			iEnd = tweet.indexOf(";");
			latitude = tweet.substring(iStart,iEnd);
			String latitudeOriginal = latitude;
			String latitudeTrimmed = latitudeOriginal.trim();
			//longitude
			tweet = tweet.substring(iEnd + 1);
			iEnd = tweet.indexOf(";");
			longitude = tweet.substring(iStart,iEnd);
			String longitudeOriginal = longitude;
			String longitudeTrimmed = longitudeOriginal.trim();
			
		//print to terminal 
		System.out.println("Type: \t\t" + typeTrimmed);
		System.out.println("Detail: \t" + detailTrimmed);
		System.out.println("Location: \t" + locationTrimmed);
		System.out.println("Latitude: \t" + latitudeTrimmed);
		System.out.println("Longitude: \t" + longitudeTrimmed);
		
	}//end of class main

}//end of class ParseTheTweet
