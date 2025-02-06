import java.util.Scanner;

public class program3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote.");
            System.out.println("You will be eligible to vote after " + yearsLeft + " years.");
        }

        scanner.close();
    }
}
