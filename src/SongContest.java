import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SongContest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj listę krajów biorących udział w konkursie oddzielonych przecinkiem: (ex: PL,ES,DE,BE itd ");
        String countryInput= scanner.nextLine();
        String[]countryTable = countryInput.split(",");
        StringBuilder countries = new StringBuilder("");
        int lenght = countryTable.length;
        Object[][] winners = new Object[lenght][2];
        for(int i = 0; i < countryTable.length;i++){
            winners [i][0]=countryTable[i];

        }
        for(int i = 0; i < lenght; i++){
            countries.append(winners[i][0] +",");

        }
        System.out.println(countries);


        Object[][] points = new Object[lenght * 3][3];
        for(int i = 0, k = 0; i < points.length;k++){
            for(int j = 0; j < 3; j++){
                points[i][0]= countryTable[k];
                i++;
            }

        }
        for(int i = 0; i < points.length; i++){
            System.out.println(points[i][1]);
        }

        for(int i = 0; i < lenght * 3;){

            System.out.println("Jesteś krajem " + points[i][0] +
                    " możesz zagłosować na 3 pozostałe kraje na poniższej liście: " +
                    countries + "dając im 8,10 lub 12 punktów");
            for(int j = 0; j < 3;j++){

                points[i][2]=0;
                System.out.println("podaj nazwę" +(j+1)+ " kraju, na który głosujesz");
                String countryVote = scanner.nextLine();
                points[i][1] = countryVote;
                System.out.println("podaj liczbę punktów");
                int pointsVote = scanner.nextInt();
                points[i][2]= (Integer) pointsVote + (Integer)points[i][2];
                scanner.nextLine();
                i++;
            }




        }

        for(int i = 0; i < points.length; i++) {
            System.out.println(points[i][1]);
            System.out.println(points[i][0]);
            System.out.println(points[i][2]);
        }







        points[0][0]="PL";
        points[0][1]=0;

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
