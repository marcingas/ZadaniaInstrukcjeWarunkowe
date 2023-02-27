public class Zadania {
    public static void main(String[] args) {
        //Kalkulator rzymski:
        String rom [] = {"M","CM","D","CD","C","XC","L","XL","X", "IX", "V", "IV", "I"};
        int[] arab = {1000,900,500,400,100,90,50,40,10, 9, 5, 4, 1};
        int number = 1700;
        StringBuilder sb = new StringBuilder();
                for(int a = 0; a < arab.length; a++) {
                   while (number >= arab[a]) {
                        sb.append(rom[a]);
                        number -= arab[a];
                        System.out.println(sb);
                        System.out.println("index użyty "+a);
                        System.out.println( "cyfra użyta" + arab[a]);
                        System.out.println("pozostało" + number);
                    }
            }
    }
}
