import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner (System.in);
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		int guesses = 9;
		
		System.out.println("I am thinking of a number betwee 1-100");
		System.out.println("You have 10 guesses left");
		int guess = user_input.nextInt();
		
		while(guesses >=0) {
			if (guess == 0)
				System.out.println("You lost!");
			else if(guess == num)
				System.out.println("You are correct!");
			else if (guess > num)
				System.out.println("It is less than your guess");
			else if (guess < num)
				System.out.println("It is greater than your guess");
			
			System.out.println("You have "+ guesses + " guesses left");
			System.out.println("Enter another number");
			guess = user_input.nextInt();
			guesses--;
		}
	}
}
