// Albert Ramil BSIT NETSEC 1-1
import java.util.Scanner;

public class ConcatenateString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String name = input.nextLine();

        System.out.print("Enter a favorite color: ");
        String color = input.nextLine();

        System.out.print("Enter a favorite animal: ");
        String animal = input.nextLine();

        System.out.print("Enter a favorite food: ");
        String food = input.nextLine();

        System.out.println("I had a dream that " + name + " ate a "
                + color + " " + animal
                + " and said it tasted like " + food + "!");
    }
}
