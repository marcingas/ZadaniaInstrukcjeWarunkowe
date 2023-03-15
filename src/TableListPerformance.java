import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TableListPerformance {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        List<Integer> numbers = new LinkedList<>();
        int n = 100;
        int[]numbers = new int[n];
//        for(int i = 0 ;i < n; i++){
//            numbers.add(1);
//        }
        for(int i = 0; i < n;i++){
            numbers[i]=1;
        }
        long before = System.nanoTime();
//        set array:
//        for(int i = 0; i < n;i++){
//            numbers[i]=2;
//        }
//        get array:
//        for(int i = 0; i < n;i++){
//            int number = numbers[i];
//        }
//        null array:
        for(int i = 0; i < n;i++){
            numbers[i]= 0;
        }
//        for(int i = 0 ;i < n; i++){
//            numbers.get(i);
//            numbers.set(i,2);
//        }
//      numbers.clear();

        long after = System.nanoTime();
        System.out.println("operacja dodawania dla " + n + " elementów zajęła " + (after - before) + " nanosekund");
    }
}
