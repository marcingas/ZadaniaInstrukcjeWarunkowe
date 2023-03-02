import java.util.Arrays;
import java.util.Scanner;

public class TableChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy?");

        int n = scanner.nextInt();
        int[]table = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("podaj "+ i + " element tablicy jako liczba całkowita: ");
            table[i] = scanner.nextInt();
        }
        int sum = 0;
        int sum1 = 0;
        for(int i = 0; i < table.length; i++){
            sum1 += table[i];
            if(i % 2 == 0){
                sum +=table[i];
            }
        }
        System.out.println(Arrays.toString(table));
        System.out.println("Suma cyfr na parzystych indeksach wynosi: " + sum);
        System.out.println("Suma wszystkich cyfr w tabeli wynosi: " + sum1);
    }
}
