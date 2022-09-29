import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte cakesDigit = scanner.nextByte();
        String[] cakesDigitArray = (cakesDigit + "").split("");

        String phraseEnd;

        switch (cakesDigitArray[cakesDigitArray.length - 1]) {
            case "1":
                phraseEnd = cakesDigit < 10 || cakesDigit > 20 ? "" : "ОВ";
                break;

            case "2":
            case "3":
            case "4":
                phraseEnd = cakesDigit < 10 || cakesDigit > 20 ? "А" : "ОВ";
                break;

            default:
                phraseEnd = "ОВ";
        }

        System.out.printf("%1$s ТОРТ%2$s", cakesDigit, phraseEnd);
    }
}
