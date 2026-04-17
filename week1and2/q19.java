import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            if (!input.hasNextDouble()) {
                System.out.println("Invalid input: expected a number.");
                return;
            }
            double celsius = input.nextDouble();
            
            double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;
            
            System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        }
    }
}