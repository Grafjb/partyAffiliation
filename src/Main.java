//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Your choice: ");
        String choice = in.next().toUpperCase();
        String affiliation;
        if (choice.equals("D")) {
            affiliation = "Democratic Donkey";
        } else if (choice.equals("R")) {
            affiliation = "Republican Elephant";
        } else if (choice.equals("I")) {
            affiliation = "Independent Person";
        } else {
            affiliation = "Other";
        }
        System.out.println("You get a " + affiliation + ".");
    }
}