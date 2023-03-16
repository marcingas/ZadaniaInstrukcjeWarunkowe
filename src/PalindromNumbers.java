import java.util.Arrays;
import java.util.Scanner;

public class PalindromNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile cyfr będzie miała liczba, którą chcesz podać? ");
        int length = scanner.nextInt();
        System.out.println("Podaj Twoją cyfrę:");
        int number = scanner.nextInt();

        int[] tableNumber = new int[length];

        for (int i = 0; i < length; i++) {
            tableNumber[(length - 1) - i] = number % 10;
            number /= 10;
        }
        for (int i = 0; i <= (tableNumber.length - 1) / 2; i++) {
            if (tableNumber[i] != tableNumber[(tableNumber.length - 1) - i]) {
                System.out.println("Nie Palindrom");
                System.exit(0);
            }
        }
        System.out.println("Palindrom");
    }
}
