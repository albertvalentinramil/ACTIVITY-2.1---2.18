// Albert Ramil BSIT NETSEC 1-1
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum is: " + sum);
    }
}
