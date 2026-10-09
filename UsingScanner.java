// Albert Ramil BSIT NETSEC 1-1
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = "Albert";
        String middleName = "Valentin";
        String lastName = "Ramil";

        System.out.println("Your first name: " + firstName);
        System.out.println("Your middle name: " + middleName);
        System.out.println("Your last name: " + lastName);

        System.out.println("\nYour name is: " + firstName + " "
                + middleName + " " + lastName);

        input.close();
    }
}
