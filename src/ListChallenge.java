import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListChallenge {
    public static void main(String[] args) {

        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą posortowaną listę liczb oddzielonych przecinkami: ");
        String listString1 = scanner.nextLine();
        System.out.println("Podaj drugą posortowaną listę liczb oddzielonych przecinkami:");
        String listString2 = scanner.nextLine();

        String [] temp1 = listString1.split(",");
        String [] temp2 = listString2.split(",");

        int[]tempInt1 = new int[temp1.length];
        int[]tempInt2 = new int[temp2.length];
//tablica 1 ze sprawdzeniem czy jest posortowana:

        for(int i = 0; i < tempInt1.length; i++){
            tempInt1[i]= Integer.parseInt(temp1[i]);
        }
        boolean flag = ifSorted(tempInt1);
        if(flag) {
            for (int j = 0; j < temp1.length; j++) {
                list1.add(tempInt1[j]);
            }
            flag = false;
        }
        //tablica 2 ze sprawdzeniem czy jest posortowana:

        for (int i = 0; i < tempInt2.length; i++){
            tempInt2[i] = Integer.parseInt(temp2[i]);
        }
        flag = ifSorted(tempInt2);
        if(flag) {
            for (int j = 0; j < temp2.length; j++) {
                list2.add(tempInt2[j]);
            }
            flag = false;
        }
    }

    public static boolean ifSorted(int[]table){
        for(int i = 0; i < table.length -1; i++){
            if(table[i]> table[i+1]){
                return false;
            }
        }
        return true;
    }
}
