import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SongContest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj listę krajów biorących udział w konkursie oddzielonych przecinkiem: (np: PL,DE itd)");
        String countryInput = scanner.nextLine();


        String[] countryTable = countryInput.split(",");
        StringBuilder countriesListTemp = new StringBuilder("");
        int lenght = countryTable.length;
        while (lenght < 4) {
            System.out.println("Musisz podać conajmniej 4 kraje!");
            System.out.println("Podaj listę krajów biorących udział w konkursie oddzielonych przecinkiem: (np: PL,DE itd)");
            countryInput = scanner.nextLine();

//                tworzenie tabeli z listy String podanej przez użytkownika
            countryTable = countryInput.split(",");
            countriesListTemp = new StringBuilder("");
            lenght = countryTable.length;

        }
        Object[][] winners = new Object[lenght][2];

        for (int i = 0; i < countryTable.length; i++) {
            winners[i][0] = countryTable[i];
        }

        for (int i = 0; i < lenght; i++) {
            countriesListTemp.append(winners[i][0] + ",");
        }

        Object[][] points = new Object[lenght * 3][3];
        for (int i = 0, k = 0; i < points.length; k++) {
            for (int j = 0; j < 3; j++) {
                points[i][0] = countryTable[k];
                i++;
            }
        }
//            mechanizm głosowania ze sprawdzeniami:
        for (int i = 0; i < lenght * 3; ) {

            System.out.println("Jesteś krajem " + points[i][0] +
                    " możesz zagłosować na 3 pozostałe kraje na poniższej liście"
                    + " dając im 8,10 lub 12 punktów:");
            for (int j = 0; j < 3; j++) {
                points[i][2] = 0;
//                sprawdzenie czy głosujemy na kraj który jest na liście:
                boolean flag = false;
                String countryVote = "";
                while (!flag) {
                    System.out.println("podaj poprawną nazwę kraju z listy : (" + countriesListTemp + ")");
                    countryVote = scanner.nextLine();
                    for (int check = 0; check < winners.length; check++) {
                        if (countryVote.equals(winners[check][0])) {
                            flag = true;
                            break;
                        }
                    }
                }

                while (countryVote.equals(points[i][0])) {
                    System.out.println("Nie głosuj na siebie to nie uczciwe! Podaj poprawną nazwę:");
                    countryVote = scanner.nextLine();

                }
                points[i][1] = countryVote;
                System.out.println("podaj liczbę punktów:");
                int pointsVote = scanner.nextInt();
                while (pointsVote != 8 && pointsVote != 10 && pointsVote != 12) {
                    System.out.println("Możesz podać tylko 8,10 lub 12 pkt. Podaj liczbę pkt");
                    pointsVote = scanner.nextInt();
                }

                points[i][2] = (Integer) pointsVote + (Integer) points[i][2];
                scanner.nextLine();
                i++;
            }
        }
        //przypisanie pkt do tablicy winners:
        winners[0][1] = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < winners.length; j++) {

                if (points[i][1].equals(winners[j][0])) {
                    if (winners[j][1] == null)
                        winners[j][1] = 0;
                    if ((Integer) points[i][2] == 12)
                        winners[j][1] = (Integer) points[i][2] + (Integer) winners[j][1];
                }
            }
        }
//        wyszukanie największej liczby pkt:
        int max = (Integer) winners[0][1];
        int count = 0;
        for (int i = 0; i < winners.length; i++) {
            System.out.println("Kraj: " + winners[i][0] + " ma pkt:" + winners[i][1]);
            if ((Integer) winners[i][1] == null)
                winners[i][1] = 0;
            if ((Integer) winners[i][1] > max) {
                max = (Integer) winners[i][1];
                count = i;
            }

        }
//        gdyby okazało się, że kraje mają równą liczbę pkt:
        for (int i = 0; i < winners.length; i++) {
            if (max == (Integer) winners[i][1]) {
                count = i;
                System.out.println("Zwycięzcą konkursu jest: " + winners[count][0]);
            }
        }
    }
}
