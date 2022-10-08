public class NumberDigits {
    private static int sumNumbers(int number) {
        int result = 0;

        while (number > 0) {
            result = result + number % 10;
            number = number / 10;
        }

        return result;
    }
    public static int sumOfSeven(int a, int b) {
        int result = 0;

        /* Iterate through all the numbers on the numeric line */
        for (int i = a; i <= b; ++i) {
            if (i % 7 == 0) {
                result += NumberDigits.sumNumbers(i);
            }
        }

        return result;
    }
}