import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your favorite number: ");
        int favoriteNumber = input.nextInt();
        
        System.out.println("Your favorite number is " + favoriteNumber + ". That's a great choice!");
        
        input.close();
    }
}
