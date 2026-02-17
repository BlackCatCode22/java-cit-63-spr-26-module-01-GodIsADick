import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        
        System.out.print("Enter a place: ");
        String place = input.nextLine();

        String story = "One day, a " + adjective + " " + noun + " decided to " + verb + " at the " + place + ".";

        System.out.println("\nHere is your story:");
        System.out.println(story);

        input.close();
    }
}
