import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SongContest {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile krajów bierze udział w Twoim konkursie ?");
        int length = 4;
        while (length < 4) {
            System.out.println("w konkursie muszą wziąć udział min 4 kraje, podaj liczbę krajów:");
            length = scanner.nextInt();
        }
        int rowsCount = length * 3;
        int columnCount = 3;
        String[][] points = new String[rowsCount][columnCount];

        for (int i = 0; i < rowsCount; i++) {
            System.out.println("jakim jesteś krajem?");
            String fromCountry = scanner.next();
            points[i][0] = fromCountry;
            System.out.println("na jaki kraj głosujesz?");
            String toCountry = scanner.next();
            while (fromCountry.equals(toCountry)) {
                System.out.println("Nie możesz głosować na siebie, podaj inny kraj: ");
                toCountry = scanner.nextLine();
            }
            points[i][1] = toCountry;
            System.out.println("podaj punkty:");
            String pointsAdded = scanner.next();
            while (Integer.parseInt(pointsAdded) != 8 || Integer.parseInt(pointsAdded) != 10 ||
                    Integer.parseInt(pointsAdded) != 12) {
                System.out.println("możesz wybrać tylko 8,10 lub 12 punktów, podaj właściwą liczbę pkt: ");
                pointsAdded = scanner.nextLine();
            }
            points[i][2] = pointsAdded;
        }

        String[][] winners = new String[length][2];
//        String[][] points = {{"DE", "PL", "12"}, {"SE", "PL", "12"}, {"PL", "DE", "10"}, {"DE", "SE", "12"}};

        for (int i = 0; i < points.length; i++) {
            if (Integer.parseInt(points[i][2]) == 12) {
                System.out.println("kraj points==12: " + points[i][1]);
                boolean flag = true;
                for (int k = 0; k < winners.length - k; k++) {
                    if (winners[k][0] == points[i][1]) {
                        flag = false;
                        break;
                    }
                }
                System.out.println(flag);
                if (flag) {
                    winners[i][0] = points[i][1];
                    winners[i][1] = points[i][2];
                    System.out.println("winners: " + Arrays.deepToString(winners));
                } else {
                    for (int z = 0; z < winners.length; z++) {
                        if (points[i][1] == winners[z][0]) {
                            winners[z][1] = Integer.toString(Integer.parseInt(winners[z][1]) +
                                    Integer.parseInt(points[i][2]));
                        }
                    }
                    System.out.println("winners: " + Arrays.deepToString(winners));
                }
            }
        }

        int max = Integer.parseInt(winners[0][1]);
        int countryCount = 0;
        for (int i = 0; i < winners.length; i++) {
            if (winners[i][1] == null) {
                winners[i][1] = "0";
            }
            System.out.println(Arrays.deepToString(winners));

            if (Integer.parseInt(winners[i][1]) > max) {
                max = Integer.parseInt(winners[i][1]);
                countryCount = i;
            }
        }
        System.out.println("Zwycięzcą konkursu z liczbą punktów : " + max + " zostaje " + winners[countryCount][0]);
    }
}

