import java.util.Scanner;

public class Task3_WithoutArrays {
    public static void main(String[] args) {
        System.out.println("To get the result, you need to write any characters other than numbers after entering the array");
        Scanner scanner = new Scanner(System.in);

        int lastPositiveMinNumber = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number > 0) {
                    if (lastPositiveMinNumber == 0 || number < lastPositiveMinNumber) {
                        lastPositiveMinNumber = number;
                    }
                }
            } else {
                break;
            }
        }

        System.out.println(lastPositiveMinNumber);
    }
}
