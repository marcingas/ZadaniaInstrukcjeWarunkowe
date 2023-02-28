import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrom-> Podaj słowo, które chcesz sprawdzić:");
        String word = scanner.nextLine();
        String[]wordArr = word.split("");
        String[]newArr = new String[wordArr.length];
        for(int a = 0; a< newArr.length; a++ ){
            newArr[a]=wordArr[(newArr.length- 1)-a];
        }
        String reverse = String.join("",newArr);
        System.out.println(reverse);
        System.out.println("Podane słowo " + word+ ((word.equals(reverse)) ? " -> Tak": " -> Nie") + " jest palindromem");
    }
    }


