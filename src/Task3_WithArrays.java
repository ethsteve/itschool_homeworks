import java.util.Scanner;

public class Task3_WithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersArray = scanner.nextLine().split(" ");

        int lastPositiveMinNumber = 0;

        for (String stringNumber : numbersArray) {
            int number = Integer.parseInt(stringNumber);

            if (number > 0) {
                if (lastPositiveMinNumber == 0 || number < lastPositiveMinNumber) {
                    lastPositiveMinNumber = number;
                }
            }
        }

        System.out.println(lastPositiveMinNumber);
    }
}
