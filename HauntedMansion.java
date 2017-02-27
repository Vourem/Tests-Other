import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class HauntedMansion {
		public static void slowPrintln(String text) {
        slowPrintln(text, 40);
    String[] inventory = {""};
    int SWORD;

    }

    public static void slowPrintln(String text, int ms) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(ms);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		new HauntedMansion();
		
		String choice;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Haunted Mansion! This is a simple text-based exploration game. To play, type any command you wish to execute. \nIf it is a valid command, your character will go through with the action.\nTyping 'explore' at any time will allow you to explore your current surroundings.");
		System.out.println("Press Enter");
		choice = input.nextLine();

		slowPrintln("\nYou enter a massive mansion, clearly untouched by humans for hundreds of years. There are two large staircases on either side of the lobby that converge into a balcony above. There are doors to your left and right.\nTo enter the room on your left, type 'left'\nTo enter the room on your right, type 'right'\nTo go up the staircase in front of you, type 'up'");
		choice = input.nextLine();
		System.out.print("> ");
		if (choice.equals ("left")) {
			
			slowPrintln("You enter the kitchen.");
			System.out.println("What next?");
			choice = input.nextLine();
			System.out.print("> ");
			if (choice.equals ("explore")) {
				slowPrintln("The entire room is destroyed. There appears to have been a fire, but only the kitchen seems to have been affected.");
				}
			if (choice.equals ("take [SWORD]")) {

				new inventory (SWORD);
			}
		}
		else if (choice.equals("right")) {
			
			slowPrintln("You enter the dining hall.");
		}
		else if (choice.equals("up")) {
			
			slowPrintln("You go upstairs. There is a balcony and two doors on either end, much like a hallway, and a large wooden double-door in the middle");
		}
		else {
			
			System.out.println("Invalid command.");
		}
	}
}