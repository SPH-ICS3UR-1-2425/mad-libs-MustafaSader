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
	System.out.println("Whats your friend's name?");
	String name2  = in.nextLine();
	System.out.println("what's your favorite animal?");
	String animal = in.nextLine();
	System.out.println("What's your favorite number?");
	int favorite = in.nextInt();
	System.out.println("give me a decimal number");
	double decNumber = in.nextDouble();
		in.nextLine();
	System.out.println("what's your favorite subject?");
	String favSub = in.nextLine();
	System.out.println ("how's your week been like, in just a few words?");
	String Week = in.nextLine();
	System.out.println ("on a scale of 1-10, how was this project?");
	int rate = in.nextInt();
	System.out.println("On "+dayOfWeek+","+name+" was playing "+sport+" when his friend "+name2+" came to him and asked: how many "+animal+"'s do you have?" );
		System.out.println("\n Then, "+favorite+" cars came into the playground and told him to bring "+decNumber+" Lunch boxes to the family gathering.");
			System.out.println ("\n Then for the end of the assignment, we proceed to tell you that the user's favorite subject is "+favSub+" and that his week was in a way,"+Week+"");
					System.out.println ("\n The man rates our project on a scale of 1-10, a "+rate+"");
	in.close();
	}

}
