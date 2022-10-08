import java.util.Arrays;

public class MyArrays {
    private static double average(int[] array) {
        return Arrays.stream(array)
                .filter(x -> String.valueOf(x).length() == 4)
                .average()
                .orElse(-1.);
    }

    public static double avgOf4Digit(int[] numbers) {
        int i = 0;

        /* Find element count */
        for (int number : numbers) {
            if (number >= 1000 && number <= 9999) {
                ++i;
            }
        }

        int[] avgNumbers = new int[i + 1];
        i = 0;

        for (int number : numbers) {
            if (number >= 1000 && number <= 9999) {
                avgNumbers[i] = number;
                ++i;
            }
        }

        return MyArrays.average(avgNumbers);
     }
}
