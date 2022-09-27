import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();

        System.out.println(!(x >= -2 && x <= 3 || x >= 6 && x <= 9));
    }
}
