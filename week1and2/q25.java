import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        
        if (numberOfChildren == 0) {
            System.out.println("Error: number of children cannot be zero.");
        } else {
            int gets = numberOfChocolates / numberOfChildren;
            int remaining = numberOfChocolates % numberOfChildren;
            System.out.println("The number of chocolates each child gets is " + gets + " and the number of remaining chocolates are " + remaining);
        }
        
        input.close();
    }
}