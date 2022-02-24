/*
* [GradeCalculator].java
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
public class GradeCalculator {

	public static void main(String[] args) {
		 //scanner for user input
		 Scanner stdin = new Scanner(System.in);
		 //declare variables
		 int exam1Weight;
		 int exam2Weight;
		 int finalExamWeight;
		 int labsWeight;
		 int projectsWeight;
		 int participationWeight;	
		 int quizzesWeight;

		 int exam1Score;
		 int exam2Score;
		 int finalExamScore;
		 int labsScore;
		 int projectsScore;
		 int participationScore; 
		 int quizzesScore;
		 // calculation variables
		 double finalOverallScore;
	     double avgToFinalLetterGrade; 
	     double totalKnownGradeWeight = 0;
	     double currentScore; 
	     double currentScoreTop = 0; //currentScore Numerator Value
	     
	     String letterGrade;
	     String yesNo;
		 //user input
		 System.out.println("A\t 90 - 100"); 
		 System.out.println("B\t 80 - 89"); 
		 System.out.println("C\t 70 - 79"); 
		 System.out.println("D\t 60 - 69"); 
		 System.out.println("E\t below 60"); 
		 System.out.print("What letter grade do you want to achieve for the course?: ");
		 letterGrade = stdin.nextLine();
		 	if(letterGrade.equals("A")
		 	   ||letterGrade.equals("B")
		 	   ||letterGrade.equals("C")
		 	   ||letterGrade.equals("D")
		 	   ||letterGrade.equals("F") ){	
		 	      switch (letterGrade){ // min. grade user wants 
		 	        case ("A"):
		 	        	finalOverallScore = 90;
		 	        	break;
		 	        case ("B"):
		 	        	finalOverallScore = 80;
		 	        	break;
		 	        case ("C"):
		 	        	finalOverallScore = 70;
		 	        	break;
		 	        case ("D"):
		 	        	finalOverallScore = 60;
		 	        	break;
		 	        default:
		 	        	finalOverallScore = 0;
		 	        	break;
		 	      }
		 	    //user enter percentage weights 
				System.out.println("Enter percentage weights below.");
				System.out.print("Exam 1:\t\t");
			 	exam1Weight = stdin.nextInt();		
				System.out.print("Exam 2:\t\t");
			 	exam2Weight = stdin.nextInt();		
			 	System.out.print("Final Exam:\t");
			 	finalExamWeight = stdin.nextInt();		
				System.out.print("Labs:\t\t");
				labsWeight = stdin.nextInt();		
				System.out.print("Projects:\t");
				projectsWeight = stdin.nextInt();		
				System.out.print("Participation:\t");
				participationWeight = stdin.nextInt();		
				System.out.print("Quizzes:\t");
				quizzesWeight = stdin.nextInt();
				stdin.nextLine();
				// check if weights = 100 or not
				int weights = exam1Weight + exam2Weight + finalExamWeight + labsWeight + projectsWeight + participationWeight + quizzesWeight;
					if (weights == 100) {
							//exam 1 
						System.out.print("Do you know your exam 1 score? ");
						yesNo = stdin.nextLine();
						if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){	
							System.out.print("Score received on exam 1: ");
							exam1Score = stdin.nextInt();
							stdin.nextLine();
							totalKnownGradeWeight += exam1Weight;
							currentScoreTop += (exam1Weight * exam1Score);
							// exam 2 
							System.out.print("Do you know your exam 2 score? ");
							yesNo = stdin.nextLine();
			 				if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){	
			 					System.out.print("Score received on exam 2: ");
			 					exam2Score = stdin.nextInt();
			 					stdin.nextLine();									
								totalKnownGradeWeight += exam2Weight;
					            currentScoreTop += (exam2Weight * exam2Score);
			 					//final exam
			 					System.out.print("Do you know your final exam score? ");
			 					yesNo = stdin.nextLine();
			 					if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){	
			 						System.out.print("Score received on final exam: ");
			 						finalExamScore = stdin.nextInt();
			 						stdin.nextLine();				 						
			 						totalKnownGradeWeight += finalExamWeight;
			 						currentScoreTop += (finalExamWeight * finalExamScore);
			 					}
			 				}
						}
					// lab 	
					System.out.print("Do you know your lab average? ");
						yesNo = stdin.nextLine();
						if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){	
 							System.out.print("Average lab grade: ");
 							labsScore = stdin.nextInt(); // user enter lab average 
 							stdin.nextLine();							
 							totalKnownGradeWeight += labsWeight;
 				            currentScoreTop += (labsWeight * labsScore);
						}			
					// project
					System.out.print("Do you know your project average? ");
					yesNo = stdin.nextLine();
						if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){	
							System.out.print("Average project grade: ");
							projectsScore = stdin.nextInt(); // user enter project average
 							stdin.nextLine();
 							
 							totalKnownGradeWeight += projectsWeight;
 				            currentScoreTop += (projectsWeight * projectsScore);				      
						}
					// participation
					System.out.print("Do you know your participation average? ");
					yesNo = stdin.nextLine();
						if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){	
							System.out.print("Average participation grade: ");
							participationScore = stdin.nextInt(); // user enter participation average
 							stdin.nextLine();							
 				            totalKnownGradeWeight += participationWeight;
 				            currentScoreTop += (participationWeight * participationScore);				            
						}
					// quiz 
					System.out.print("Do you know your quiz average? ");
					yesNo = stdin.nextLine();
						if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){	
							System.out.print("Average quiz grade: ");
							quizzesScore = stdin.nextInt(); // user enter quiz average
 							stdin.nextLine(); 							
 				            totalKnownGradeWeight += quizzesWeight;
 				            currentScoreTop += (quizzesWeight * quizzesScore);	            
						} 	
					stdin.close(); // close Scanner (user input)
					// calculation 
				    currentScore = (currentScoreTop / totalKnownGradeWeight);
				    avgToFinalLetterGrade = ((100 * finalOverallScore - currentScoreTop))/(100 - totalKnownGradeWeight);
				    //print statement
				    System.out.printf("Current grade score: %.2f\n", currentScore);										
				    // current letter grade 
				    if (currentScore >= 90 && currentScore <= 100 ){
				    	System.out.println("Your current letter grade: A");
				    } else if (currentScore >= 80 && currentScore < 90 ){
				    	System.out.println("Your current letter grade: B");
				    } else if (currentScore >= 70 && currentScore < 80 ){
				        System.out.println("Your current letter grade: C");
				    } else if (currentScore >= 60 && currentScore < 70 ){
				    	System.out.println("Your current letter grade: D");
				    } else if (currentScore < 60 ){
				        System.out.println("Your current letter grade: F");
				    } 						    
					// Grade compare / Grade needed / Satisfy Condition 
				    if (currentScore < finalOverallScore && avgToFinalLetterGrade >= 0 && avgToFinalLetterGrade <= 100){
				    	System.out.println("In order to receive a grade of " + letterGrade);
				    	System.out.printf("you need to score an average greater than\nor equal to %.2f" + " in the rest of the grade items.", avgToFinalLetterGrade);
				    } else if (avgToFinalLetterGrade > 100) {
				    	System.out.println("Unfortunately, a grade of " + letterGrade + " is not possible.");
				    } else {
				    	if (totalKnownGradeWeight == 100) { // know all grades
				    		System.out.println("Congratulations! You received the " + letterGrade + " that you wanted!");
				    	} else { // do not know all grades
				    		System.out.println("You will receive at least a grade of " + letterGrade + ".");
				    	}
				    }
				    
					} else { // weights else 
						System.out.println("Weights don’t add up to 100, program exiting...");
						System.exit(0);
					} 
		 	} else { //desire Grade else 
		 		System.out.println("The input is invalid.");
		 		System.exit(0);
		 	}
	}// end of class main

}// end of class GradeCalculator