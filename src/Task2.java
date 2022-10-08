import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; ++i) {
            array[i] = scanner.nextInt();
        }

        System.out.println(MyArrays.avgOf4Digit(array));
    }
}