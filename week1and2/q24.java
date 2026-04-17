import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1, side2, side3 (meters): ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        
        double perimeter = s1 + s2 + s3;
        if (perimeter <= 0) {
            System.out.println("Perimeter must be greater than 0.");
        } else {
            double rounds = 5000.0 / perimeter;
            System.out.printf("The total number of rounds the athlete will run to complete 5 km is %.2f%n", rounds);
        }
        input.close();
    }
}