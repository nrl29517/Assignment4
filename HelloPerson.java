import java.util.Scanner;
public class HelloPerson {

	public static void main(String[] args) {
		String temp = "";
		System.out.println("Please enter your full name. Please only put spaces in between your name");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		while( name.contains(" ") == true)
		{
			temp = name.substring(name.indexOf(" ")+ 1);
			name = temp;
		}
		
		System.out.println("Hello Mr./ Mrs./ Miss " + name);
		
	}

}
