import java.util.*;

public class Task4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = 9;

        for (; number>0; number /= 10) {
            int i = number % 10;

            if (i < result && i > 0) {
                result = i;
            }
        }

        System.out.println(result);
    }
}