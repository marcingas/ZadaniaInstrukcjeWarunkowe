import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {


        Random random = new Random();
        IntStream intStream = IntStream.generate(()->random.nextInt(100) + 1)
                        .limit(100);
        List<Integer> intList = intStream
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Lista:");
        System.out.println(intList);

        long numberOfInts = intList.stream()
                .filter(x->x % 6 == 0)
                .count();
        System.out.println("2. ile jest intów podzielnych przez 6: ");
        System.out.println(numberOfInts);

        System.out.println("3. pierwszy element podzielny przez 37: ");
      Optional<Integer> firstDividedByThree = intList.stream()
                .filter(x -> x % 6 == 0)
                .filter(x -> x % 37 == 0)
                .findFirst();
      if(firstDividedByThree.isPresent()){
          System.out.println(firstDividedByThree);
      }else{
          System.out.println("There is no element divided by 37");
      }
        System.out.println("4. Suma wszystkich elementów ");
      int sum = intList.stream()
              .mapToInt(Integer::intValue)
              .sum();
        System.out.println("Suma elementów listy " + sum);

        System.out.println("5. czy wszystkie liczby są większe od 0 i mniejsze od 100?");
        boolean istrue  = intList.stream()
                .allMatch(x -> x > 0 && x < 100);
        System.out.println("Czy to prawda? " + istrue);

        System.out.println("6.ile jest unikatowych liczb w tabeli ? ");
        long numberOfUnique = intList.stream()
                .distinct()
                .count();
        System.out.println(numberOfUnique);
        System.out.println("Wypisz te liczby: ");
        intList.stream()
                .distinct()
                .forEach(x-> System.out.println(x));
//       inny sposób wypisania:  .forEach(System.out::println);
        System.out.println("7 wypisz sumę unikatowych liczb: ");

       int sumUnique = intList.stream()
               .distinct()
               .mapToInt(Integer::intValue)
               .sum();
        System.out.println("Suma unikatowych liczb to " + sumUnique);

        System.out.println("8.usuń z listy liczby podzielne przez 3 i wypisz listę:");
        intList.stream()
                .filter(x -> x % 3 != 0)
                .collect(Collectors.toList())//collect - i collectors.toList tworzą nową listę wybranych elementów.
                .forEach(System.out::println);

        System.out.println("9. liczby o indeksach 15-30 włącznie:");

        intList.stream()
                .skip(15)
                .limit(16)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("10. zamień inty na Stringi");
    }
}
