import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = scanner.nextInt();

        int eatenRabbits = 0;
        int rabbits = 11;
        int wolves = 2;

        for (int i = 1; i <= months; ++i) {
            /* Every odd month the number of rabbits triples */
            if (i % 2 != 0) {
                /* The number of rabbits cannot exceed 19000000 */
                if (rabbits * 3 > 19000000) {
                    System.out.println("There were too many rabbits and they ate the wolves!");
                    System.exit(0);
                }

                rabbits *= 3;
            /* Every even month, every wolf eats 10 rabbits */
            } else {
                for (int ii = 0; ii < wolves; ++ii) {
                    /* If a wolf can't eat 10 rabbits, it dies */
                    if (rabbits - 10 < 0) {
                        --wolves;
                    }

                    rabbits -= 10;
                    eatenRabbits += 10;

                    /* Every 70 rabbits eaten, another wolf is born */
                    if (eatenRabbits >= 70) {
                        eatenRabbits = 0;
                        ++wolves;
                    }
                }
            }
        }
        System.out.printf("Month: %1$s\n", months);
        System.out.printf("Number of rabbits: %1$s\n", rabbits);
        System.out.printf("Number of wolves: %1$s", wolves);
    }
}
