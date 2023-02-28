import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int next;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile elementów ciągu Fibonacciego chcesz wyświetlić? ");
        int n= scanner.nextInt();
        for(int a = 0; a < n; a++){
            System.out.println(x);
            next = y;
            y = x + next;
            x = next;
        }
    }
}
