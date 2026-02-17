import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String userInput = input.nextLine();

        char ch = userInput.charAt(0);

        int unicodeValue = (int) ch;

        System.out.println("Character: " + ch);
        System.out.println("Unicode value: " + unicodeValue);

        if (Character.isLetter(ch)) {
            System.out.println("It is a letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("It is a digit.");
        } else {
            System.out.println("It is neither a letter nor a digit.");
        }

        input.close();
    }
}
