import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        byte counter = 0;

        for (String number : numbers) {
            counter += number.length() == 3 && Short.parseShort(number) % 5 == 0 ? 1 : 0;
        }

        System.out.println(counter >= 2);
    }
}
