// Albert Ramil BSIT NETSEC 1-1
public class Number {
    public static void main(String[] args) {

        System.out.println("number\tsquare\tcube");

        for (int number = 0; number <= 3; number++) {
            int square = number * number;
            int cube = number * number * number;

            System.out.println(number + "\t" + square + "\t" + cube);
        }
    }
}
