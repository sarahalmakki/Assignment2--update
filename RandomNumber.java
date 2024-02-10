import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		initing the random object 
		Random random = new Random();
//		initating the random number object
		int randomNumber = random.nextInt(100);
		System.out.println("My randomNumber is: " + randomNumber);
		Scanner scanner = new Scanner(System.in);
System.out.println("Pick a number between 1 and 100");
//set the userInput to be continued to have int 
int userInput = scanner.nextInt();
//set the attemps to be 5 times
int attemps= 5; 
while (attemps > 0) {
	if(userInput == randomNumber) {
		System.out.println("You win");
		break;
	}
else if(userInput < randomNumber) {
	System.out.println("Invalid input, pick a higher number");
	userInput = scanner.nextInt();
	attemps--;
}
else if (userInput > randomNumber) {
	System.out.println("Invalid input, pick a lower number");
	userInput = scanner.nextInt();
	attemps--;
}
if (attemps == 0) {
	System.out.println("You lost. The random number was : " + randomNumber);
}
}
	}

}
