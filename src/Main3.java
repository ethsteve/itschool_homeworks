import java.time.LocalTime;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        /* I thought this task was more difficult =) */
        Scanner scanner = new Scanner(System.in);

        String time = LocalTime.ofSecondOfDay(scanner.nextInt()).toString();

        /* A very dirty hack */
        if (time.split("")[0].equals("0")) {
            time = time.substring(1);
        }

        System.out.println(time);
    }
}
