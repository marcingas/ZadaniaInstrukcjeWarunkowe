import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n dla działania n!: ");
        int n = scanner.nextInt();
        int multiplication = 1;
        for (int a = 1; a <= n; a++ ){
            multiplication *= a;
        }
        System.out.println( "Wynik działania " + n +"! wynosi: " + multiplication);
    }
}
