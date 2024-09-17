import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author:Mustafa 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
	System.out.println("Give me a day of the week");
	String dayOfWeek = in.nextLine();
	System.out.println("Give me a sport");
	String sport = in.nextLine();
	System.out.println(" Give me a name");
	String name= in.nextLine();
	in.nextLine();
	
	System.out.println("On "+dayOfWeek+","+name+" was playing "+sport+" when his friend "+name2+" came to him and asked: how many "+animal+" do you have?" );
		in.close();
	}

}
