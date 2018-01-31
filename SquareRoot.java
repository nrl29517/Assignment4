import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number");
		Scanner keyboard = new Scanner(System.in);
		double num = keyboard.nextDouble();
		
		if(num < 0)
		{
			System.out.println("Cannot get the squareroot of a negative");
			System.exit(0);
		}
		double root = Math.sqrt(num);
		
		System.out.println("The squareroot of " + num + " is " + root);
		
		
	}

}
