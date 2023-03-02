import java.util.Scanner;

public class DeltaChallenge {
    public static void main(String[] args) {
    //a * x^2 + b * x + c = 0
    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
    int a = scanner.nextInt();
        System.out.println("Podaj b: ");
    int b = scanner.nextInt();
        System.out.println("Podaj c: ");
    int c = scanner.nextInt();
    //delta = b^2 - 4 * a * c;
        //Math.pow(b,2)
        //Math.sqrt(liczba)- pierwiastek

        quadraticEquationSolv(a, b, c);

       //zadanie 2:
        System.out.println("Podaj cenę produktu przed obniżką: ");
       double price = scanner.nextDouble();
        System.out.println("Podaj zniżkę jaką zastosować w %: ");
        double discount = scanner.nextDouble() / 100;
        System.out.println("Podaj ile maksymalnie w PLN może wynosić zniżka: podaj PLN: ");
        double maxDiscount= scanner.nextDouble();
        
        PriceDiscountCounter(price, discount, maxDiscount);

    }

    private static void PriceDiscountCounter(double price, double discount, double maxDiscount) {
        if((price * (1-discount)) >= (price - maxDiscount)){
            price *= (1-discount);
        } else{
            price -= maxDiscount;
        }
        System.out.println("Cena po zniżce wynosi: " + price);
    }

    private static void quadraticEquationSolv(int a, int b, int c) {
        int delta = getDelta(a, b, c);
        //1. delta > o, 2 delta = 0, 3 delta < 0
        if(delta > 0){
            int x1 = ((-1)* b - (int) Math.sqrt(delta)) / (2 * a);
            int x2 = (-1) * b + (int) Math.sqrt(delta)/(2 * a);
            System.out.println("Dla delty > 0 są dwa rozwiązania : x1: " +  x1
                    + " oraz x2 : " + x2);
        }else if (delta == 0){
            int x = (-1) * b / (2 * a);
            System.out.println("Dla delty = 0, jest jedno rozwiązanie  : " + x);
        } else {
            System.out.println("Dla delty < 0 nie ma rozwiązania");
        }
    }
    private static int getDelta(int a, int b, int c) {
        int delta = (int) Math.pow(b,2) - 4 * a * c;
        return delta;
    }
}
