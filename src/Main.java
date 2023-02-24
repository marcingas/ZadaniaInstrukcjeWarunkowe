import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String... args) {
        //1
        System.out.println("podaj liczbę? ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        number *= 2;
        if( number > 100 ){
            number -= 50;
        } else{
        }
        System.out.println(number);
        System.out.println("podaj liczbę? ");

        //2.
        int number1 = scanner.nextInt();
        if( number1 % 2 == 0){
            System.out.println("liczba jest podzielna przez 2");
        }
        //3.
        int number2 = scanner.nextInt();
        if( number2 % 2 == 0){
            System.out.println("liczba jest podzielna przez 2");
        }else{
            System.out.println("liczba nie jest podzielna przez 2");
        }
        //4.
        int number3 = scanner.nextInt();
        if( (number3 % 2 == 0) || (number3 % 3 == 0)){
            System.out.println("liczba jest podzielna przez 2 lub przez 3");
        }
        //5.
        int number4 = scanner.nextInt();
        if( (number4 % 2 == 0) || (number4 % 3 == 0)){
            System.out.println("liczba jest podzielna przez 2 lub przez 3");
        } else if(number4 % 5 == 0){
            System.out.println("liczba jest podzielna przez 5");
        } else if (number4 % 7 == 0){
            System.out.println("liczba jest podzielna przez 7");
        }
        //6.
        int number5 = scanner.nextInt();
        if( (number5 % 5 == 0)){
            System.out.println("liczba jest podzielna przez 5");
        } else if(number5 % 7 == 0){
            System.out.println("liczba jest podzielna przez 7");
        } else if ((number5 % 5 == 0) && (number5 % 7 == 0)){
            System.out.println("liczba jest podzielna przez 5 i  7");
        }
        //7.
    }
}