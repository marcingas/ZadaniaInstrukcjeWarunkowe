import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {


        Random random = new Random();
        IntStream intStream = IntStream.generate(()->random.nextInt(100))
                        .limit(10);
        List<Integer> intList = intStream
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Lista:");
        System.out.println(intList);

        long numberOfInts = intList
                .stream().filter(x->x % 6 == 0)
                .count();
        System.out.println("ile jest intów podzielnych przez 6: ");
        System.out.println(numberOfInts);

//         intList
//                .stream().filter(x->x % 6 == 0)
//                .forEach(System.out::println);
        System.out.println("int podzielne przez 6 i przez 3 : ");
        intList.stream()
                .filter(x->x%6==0)
                .sorted(Comparator.comparingInt(x->x%3 == 0 ? 0 : 1 ))
                .forEach(System.out::println);
        System.out.println("pierwszy element podzielny przez 3: ");
      Optional<Integer> firstDividedByThree = intList.stream()
                .filter(x->x%6==0)
                .filter(x->x%3 ==0)
                .findFirst();
      if(firstDividedByThree.isPresent()){
          System.out.println(firstDividedByThree);
      }else{
          System.out.println("There is no element divided by 3");
      }

    }
}
