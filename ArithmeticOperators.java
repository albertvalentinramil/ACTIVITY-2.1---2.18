// Albert Ramil BSIT NETSEC 1-1
public class ArithmeticOperators {

    public static void main(String[] args) {

        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;

        System.out.println("Variable values...");
        System.out.println("\ti = " + i);
        System.out.println("\tj = " + j);
        System.out.println("\tx = " + x);
        System.out.println("\ty = " + y);

        System.out.println("Adding...");
        System.out.println("\ti + j = " + (i + j));
        System.out.printf("\tx + y = %.3f%n", (x + y));

        System.out.println("Subtracting...");
        System.out.println("\ti - j = " + (i - j));
        System.out.printf("\tx - y = %.3f%n", (x - y));

        System.out.println("Multiplying...");
        System.out.println("\ti * j = " + (i * j));
        System.out.printf("\tx * y = %.2f%n", (x * y));

        System.out.println("Dividing...");
        System.out.println("\ti / j = " + (i / j));
        System.out.printf("\tx / y = %.4f%n", (x / y));

        System.out.println("Computing the remainder...");
        System.out.println("\ti % j = " + (i % j));
        System.out.printf("\tx %% y = %.3f%n", (x % y));

        System.out.println("Mixing types...");
        System.out.printf("\tj + y = %.2f%n", (j + y));
        System.out.printf("\ti * x = %.2f%n", (i * x));
    }
}
