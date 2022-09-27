import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short a = scanner.nextShort();
        byte b = scanner.nextByte();
        short n = scanner.nextShort();

        /* 3000 * 3000 (max program value) = 9.000.000 */
        int rubSum = a * n;
        int copSum = b * n;

        if (copSum == 100) {
            ++rubSum;
        } else {
            rubSum += copSum / 100;
            copSum = copSum % 100;
        }

        System.out.println(rubSum + " " + copSum);
    }
}
