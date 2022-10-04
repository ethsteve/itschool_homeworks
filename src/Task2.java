import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        String reversedNumber = new StringBuilder(number).reverse().toString().replace("-", "");

        if (number.startsWith("-")) {
            reversedNumber = "-" + reversedNumber;
        }

        System.out.println(Integer.valueOf(reversedNumber));
    }
}
