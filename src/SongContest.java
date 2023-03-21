import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SongContest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj listę krajów biorących udział w konkursie oddzielonych przecinkiem: (ex: PL,DE itd)");
        String countryInput = scanner.nextLine();
        String[] countryTable = countryInput.split(",");
        StringBuilder countries = new StringBuilder("");
        int lenght = countryTable.length;
        Object[][] winners = new Object[lenght][2];

        for (int i = 0; i < countryTable.length; i++) {
            winners[i][0] = countryTable[i];
        }

        for (int i = 0; i < lenght; i++) {
            countries.append(winners[i][0] + ",");
        }

        Object[][] points = new Object[lenght * 3][3];
        for (int i = 0, k = 0; i < points.length; k++) {
            for (int j = 0; j < 3; j++) {
                points[i][0] = countryTable[k];
                i++;
            }
        }

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i][1]);
        }

        for (int i = 0; i < lenght * 3; ) {

            System.out.println("Jesteś krajem " + points[i][0] +
                    " możesz zagłosować na 3 pozostałe kraje na poniższej liście: " +
                    countries + "dając im 8,10 lub 12 punktów");
            for (int j = 0; j < 3; j++) {
                points[i][2] = 0;

                System.out.println("podaj nazwę" + (j + 1) + " kraju (" + countries + "), na który głosujesz");
                String countryVote = scanner.nextLine();
                points[i][1] = countryVote;
                System.out.println("podaj liczbę punktów:");
                int pointsVote = scanner.nextInt();
                points[i][2] = (Integer) pointsVote + (Integer) points[i][2];
                scanner.nextLine();
                i++;
            }
        }

        winners[0][1] = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < winners.length; j++) {

                if (points[i][1].equals(winners[j][0])) {
                    if (winners[j][1] == null)
                        winners[j][1] = 0;
                    winners[j][1] = (Integer) points[i][2] + (Integer) winners[j][1];
                }
            }
        }

        for (int i = 0; i < winners.length; i++) {
            System.out.println("Kraj" + winners[i][0] + " ma pkt:" + winners[i][1]);

        }
    }
}
