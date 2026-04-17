import java.util.Scanner;

// Rename this file to q29.java so it matches the public class name 'q29'.
public class q20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;
        
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        input.close();
    }
}