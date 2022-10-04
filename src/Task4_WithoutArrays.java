import java.util.Scanner;

public class Task4_WithoutArrays {
    public static void main(String[] args) {
        System.out.println("To get the result, you need to write any characters other than numbers after entering the array");
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        int lastElement = 0;
        int i = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (i != 0) {
                    if (number > lastElement) {
                        result.append(number).append(" ");
                    }
                }

                lastElement = number;
                ++i;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}
