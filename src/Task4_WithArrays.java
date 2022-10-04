import java.util.Scanner;

public class Task4_WithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersArray = scanner.nextLine().split(" ");

        StringBuilder result = new StringBuilder();
        int lastElement = 0;
        int i = 0;

        for (String stringNumber : numbersArray) {
            int number = Integer.parseInt(stringNumber);

            if (i != 0) {
                if (number > lastElement) {
                    result.append(number).append(" ");
                }
            }

            lastElement = number;
            ++i;
        }

        System.out.println(result);
    }
}
