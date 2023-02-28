import java.util.Scanner;

public class SystemRzymski {
    public static void main(String[] args) {
        //Kalkulator rzymski:
        String romanNumbers [] = {"M","CM","D","CD","C","XC","L","XL","X", "IX", "V", "IV", "I"};
        int[] arabNumbers = {1000,900,500,400,100,90,50,40,10, 9, 5, 4, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę, którą chcesz zamienić od 1 - 3999:");
        int number = scanner.nextInt();
        int number1 = number;
        if(number > 3999 || number <=0){
            System.out.println("Podaj liczbę z zakresu 1-3999");
        }
        StringBuilder sb = new StringBuilder();
                for(int a = 0; a < arabNumbers.length; a++) {
                   while (number >= arabNumbers[a]) {
                        sb.append(romanNumbers[a]);
                        number -= arabNumbers[a];
                    }
            }
        System.out.println("Twoja liczba: " + number1 + " w systemie rzymskim wygląda następująco: " + sb);
    }
}
