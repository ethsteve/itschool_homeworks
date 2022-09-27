import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] coords = scanner.nextLine().split(" ");
        float x = Float.parseFloat(coords[0]);
        float y = Float.parseFloat(coords[1]);

        System.out.println(x <= 2 - x * x && y >= x && x <= 0 || y <= 2 - x * x && y > 0 && x <= Math.sqrt(2) ? "YES" : "NO");
    }
}
