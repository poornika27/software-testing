import java.util.Scanner;

public class program4 {
    public static float calculateSimpleInterest(float P, float R, float T) {
        return (P * R * T) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        float P = sc.nextFloat();
        System.out.println("Enter Rate of Interest:");
        float R = sc.nextFloat();
        System.out.println("Enter Time Period (years):");
        float T = sc.nextFloat();

        float SI = calculateSimpleInterest(P, R, T);
        System.out.println("Simple Interest = " + SI);
        sc.close();
    }
}
