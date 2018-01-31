import java.util.Scanner;


public class ConvertNumberOrCharacter {

	public static void main(String[] args) {
		System.out.println("Please enter a number or character");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();
		
		if((input.charAt(0) >= 65 && input.charAt(0) <= 90)|| (input.charAt(0) >= 97 && input.charAt(0) <= 122))
		{
			System.out.println("The letter " + input + " in binary is " + Integer.toBinaryString(input.charAt(0)));
			System.out.println("The letter " + input + " in hexadecimal is " + Integer.toHexString(input.charAt(0)));
		}
		 else if(input.charAt(0) >= 48 && input.charAt(0) <= 57)
		{
			System.out.println("The number " + input + " in binary is " + Integer.toBinaryString(Integer.parseInt(input)));
			System.out.println("The number " + input + " in hexadecimal is " + Integer.toHexString(Integer.parseInt(input)));
		}
		
	}

}
