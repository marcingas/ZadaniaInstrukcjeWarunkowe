import java.util.ArrayList;
import java.util.Scanner;

public class SongContest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj listę krajów biorących udział w konkursie oddzielonych przecinkiem: (ex: PL,ES,DE,BE itd ");
        String countryInput= scanner.nextLine();
        String[]countryTable = countryInput.split(",");
        StringBuilder countries = new StringBuilder("");
        int lenght = countryTable.length;
        Object[][] points = new Object[lenght][3];
        for(int i = 0; i < countryTable.length;i++){
            points [i][0]=countryTable[i];

        }
        for(int i = 0; i < lenght; i++){
            countries.append(points[i][0] +",");

        }
        System.out.println(countries);
        Object [] temp = new Object[6];
        for(int i = 0; i < lenght;i++){
            System.out.println("Jesteś krajem " + points[i][0] +
                    " możesz zagłosować na 3 pozostałe kraje na poniższej liście: " +
                    countries + "dając im 8,10 lub 12 punktów");
            for(int j = 0; i <3;j++){
                System.out.println("podaj nazwę " + (i+1) + " kraju");
                String countryVote = scanner.nextLine();
                System.out.println("podaj liczbę punktów");
                int pointsVote = scanner.nextInt();
                scanner.nextLine();
                i++;
            }




        }



//        points[0][0]="DE";//kto niemcy kto to kolumna 0
//        points[0][1]="PL";//komu Polakom to kolumna 1
//        points[0][2]= 12;//ile to kolumna 2
//        points[1][0]="FR";//kto polacy kolumna 0
//        points[1][1]="PL";//komu niemcom 1
//        points[1][2]= 10;
//        points[2][0]="FR";//kto polacy kolumna 0
//        points[2][1]="PL";//komu niemcom 1
//        points[2][2]= 10;
        //zeby sprawdzić kto to musimy sprawdzić points[i][0]
//        żeby sprawdzić komu to points[i][1]
//        żęby sprawdzić ilie to points[i][2]

        Object[][] winners = new Object[3][2];
        winners[0][0]="PL";
        winners[0][1]=0;

//        for(int i = 0; i < points.length;i++){
//            System.out.println("Kto:" + points[i][0]);
//            System.out.println("komu" + points[i][1]);
//            if(points[i][1].equals("PL")){
//                winners[0][1] =(Integer)points[i][2] + (Integer)winners[0][1] ;
//
//            }
//            System.out.println("ile" + points[i][2]);
//
//        }
        System.out.println("Polacy mają pkt " + winners[0][1]);



    }
}
