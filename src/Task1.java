import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* My awesome code... */
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        /* This code snippet is just a joke)) I understand perfectly well that this is a horror
        int sum = 0;
        switch (number) {
            case "100":
                sum = 1 + 0 + 0;
                break;
            case "101":
                sum = 1 + 0 + 1;
                break;
            case "102":
                ......
        }
        System.out.println(sum);
        This code snippet is just a joke)) I understand perfectly well that this is a horror */

        /* The range of numbers that can be contained in these variables is from 0 to 9. byte is used here to save memory */
        byte hundreds = Byte.parseByte(number.split("")[0]);
        byte dozens = Byte.parseByte(number.split("")[1]);
        byte units = Byte.parseByte(number.split("")[2]);

        short parsedNumber = Short.parseShort(number);

        System.out.println(hundreds + dozens + units);
        /* To be honest, I didn't understand this before. I was very surprised 0_0 */
        System.out.println(parsedNumber - parsedNumber % 2 + 2);
    }
}