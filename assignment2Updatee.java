package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class assignment2Updatee {

public static void main(String[] args) {
				// TODO Auto-generated method stub
//				Initing random object
Random random = new Random();
Scanner scanner = new Scanner(System.in);
int randomNumber = random.nextInt(100);
System.out.println("random number is : " + randomNumber);
System.out.println("Pick a number between 1 to 100");
int userInput = scanner.nextInt();	
int attemps = 5;
while  (attemps  >  0 ) {
		if (userInput == 0 || userInput > 100) {
			 System.out.println("Guesses should be between 1 and 100");
			 System.out.println("Invalid input. Please enter an integer between 1 and 100.");
		     userInput = scanner.nextInt();
		     continue;
		}
		if (userInput < randomNumber) {
 System.out.println("Invalid number , please pick a higher number");
 userInput = scanner.nextInt();
 attemps--;
 }

	else if (userInput > randomNumber) {
System.out.println("Invalid number, please pick a lower number");
 userInput = scanner.nextInt();
 attemps--;

	 }
	 else if (userInput == randomNumber){
 System.out.println("You win");
 break;
 }
	
}
  {
System.out.println("You lost. The random number is : " + randomNumber);
					 }
}
}

				 
					 
		    









