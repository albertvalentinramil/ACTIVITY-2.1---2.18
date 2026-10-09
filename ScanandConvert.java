//Albert Ramil BSIT NETSEC 1-1
import java.util.Scanner;

public class ScanandConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Java grade: ");
        String javaGrade = input.nextLine();

        System.out.print("Enter C++ grade: ");
        String cppGrade = input.nextLine();

        System.out.print("Enter C# grade: ");
        String csharpGrade = input.nextLine();

        // Convert String values to double
        double java = Double.parseDouble(javaGrade);
        double cpp = Double.parseDouble(cppGrade);
        double csharp = Double.parseDouble(csharpGrade);

        // Calculate average
        double average = (java + cpp + csharp) / 3;

        System.out.println("Java Grade: " + java);
        System.out.println("C++ Grade: " + cpp);
        System.out.println("C# Grade: " + csharp);
        System.out.println("Total Average: " + average);

        input.close();
    }
}
