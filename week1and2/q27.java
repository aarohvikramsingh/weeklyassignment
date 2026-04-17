import java.util.Scanner;

public class q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightLbs = input.nextDouble();
        
        // Correct conversion: 1 pound = 0.45359237 kg
        final double POUND_TO_KG = 0.45359237;
        double weightKg = weightLbs * POUND_TO_KG;
        
        System.out.println("The weight of the person in pounds is " + weightLbs + " and in kg is " + weightKg);
        input.close();
    }
}