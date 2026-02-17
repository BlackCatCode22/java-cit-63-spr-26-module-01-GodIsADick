import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (in percent): ");
        double rate = input.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = input.nextDouble();

        double interest = principal * (rate / 100) * time;

        System.out.println("Simple Interest = " + interest);

        input.close();
    }
}
