import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long earlyFib = 0;
        long currentFib = 1;

        for (int i = 0; i < n - 1; ++i) {
            long newFib = earlyFib + currentFib;
            earlyFib = currentFib;
            currentFib = newFib;
        }

        System.out.println(currentFib);
    }
}