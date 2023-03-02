import java.util.Scanner;

public class ArabicNumbers {
    public static void main(String[] args) {
        String romanNumbers [] = {"M","CM","D","CD","C","XC","L","XL","X", "IX", "V", "IV", "I"};
        int[] arabNumbers = {1000,900,500,400,100,90,50,40,10, 9, 5, 4, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę rzymską, którą chcesz zamienić:");
        String romanNumber = scanner.nextLine();
        String[]letters = romanNumber.split("");
        int number = 0;
        for(int b = 0; b < letters.length;b++){
                for(int a = 0; a < romanNumbers.length; a++){
                    if(letters[b].equals(romanNumbers[a])){
                        number += arabNumbers[a];
                        break;
                    }
            }
            }
        System.out.println("Podana przez Ciebie liczba rzymska to w systemie arabskim: " + number);
        }
    }

