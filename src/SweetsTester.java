import java.util.Arrays;
import java.util.Scanner;

public class SweetsTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ILe dzieci bierze udział w zabawie? ");
        int numberOfChildren = scanner.nextInt();
        System.out.println("Ile cukierków ma każde z dzieci na start(podaj liczby bez przecinków)?");
        int numberOfSweets = scanner.nextInt();
        System.out.println("Ile cukierków dodamy jednemu z dzieci?");
        int moreSweets = scanner.nextInt();

        int[] sweetsPerChildren = new int[numberOfChildren];
        boolean[] checkTable = new boolean[numberOfChildren];

        for (int i = 0; i < numberOfChildren; i++) {
            sweetsPerChildren[(numberOfChildren - 1) - i] = numberOfSweets % 10;
            numberOfSweets /= 10;
        }
        int sumOfAllSweets = 0;
        for (int i = 0; i < sweetsPerChildren.length; i++) {
            sumOfAllSweets += sweetsPerChildren[i];
        }
        System.out.println(numberOfChildren + " dzieci, ma cukierków odpowiednio: "
                + Arrays.toString(sweetsPerChildren));
        System.out.println("dodatkowa liczba cukierków to: " + moreSweets);

        for (int i = 0; i < sweetsPerChildren.length; i++) {
            int upgradedSweets = sweetsPerChildren[i] + moreSweets;
            int sumOfRestSweets = sumOfAllSweets - sweetsPerChildren[i];

            if (upgradedSweets > sumOfRestSweets) {
                checkTable[i] = true;
            } else {
                checkTable[i] = false;
            }
        }
        System.out.println("sprawdziliśmy czy dodając każdemu dziecku dodatkowe " +
                "cukierki będzie miało więcej niż pozostali: ");
        System.out.println(Arrays.toString(checkTable));
    }
}



