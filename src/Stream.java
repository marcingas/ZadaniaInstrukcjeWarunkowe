import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {


        Random random = new Random();
        IntStream intStream = IntStream.generate(() -> random.nextInt(100) + 1)
                .limit(100);
        List<Integer> intList = intStream
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Lista:");
        System.out.println(intList);

        long numberOfInts = intList.stream()
                .filter(x -> x % 6 == 0)
                .count();

        System.out.println("2. ile jest intów podzielnych przez 6: ");
        System.out.println(numberOfInts);

        System.out.println("3. pierwszy element podzielny przez 37: ");
        Optional<Integer> firstDividedByThree = intList.stream()
                .filter(x -> x % 6 == 0)
                .filter(x -> x % 37 == 0)
                .findFirst();
        if (firstDividedByThree.isPresent()) {
            System.out.println(firstDividedByThree);
        } else {
            System.out.println("There is no element divided by 37");
        }
        System.out.println("4. Suma wszystkich elementów ");
        int sum = intList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma elementów listy " + sum);

        System.out.println("5. czy wszystkie liczby są większe od 0 i mniejsze od 100?");
        boolean istrue = intList.stream()
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
                .forEach(x -> System.out.println(x));
//       inny sposób wypisania:  .forEach(System.out::println);

        System.out.println("7 wypisz sumę unikatowych liczb: ");

        int sumUnique = intList.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma unikatowych liczb to " + sumUnique);

        System.out.println("8.usuń z listy liczby podzielne przez 3 i wypisz listę:");
        List<Integer> shorterList = intList.stream()
                .filter(x -> x % 3 != 0)
                .collect(Collectors.toList());//collect - i collectors.toList tworzą nową listę wybranych elementów.
        System.out.println(shorterList);

        System.out.println("9. liczby o indeksach 15-30 włącznie:");

        List<Integer> indexList = intList.stream()
                .skip(15)
                .limit(16)
                .collect(Collectors.toList());
        System.out.println(indexList);

        System.out.println("10. zamień inty na Stringi:");
        List<String> stringList = intList.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(stringList);

        System.out.println("11. posortuj listę: ");
        List<Integer> sortedList = intList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("W odwrotnej kolejności:");
        List<Integer> reverseList = intList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseList);

        System.out.println("12. Wypisz największą wartość w liście:");
        Optional max = intList.stream()
                .max(Integer::compareTo);
        System.out.println(max);

        System.out.println("13. Wypisz najmniejszą wartość w liście:");
        Optional min = intList.stream()
                .min(Integer::compareTo);
        System.out.println(min);

        System.out.println("14. zamień listę na set:");
        Set<Integer>setInt = intList.stream()
                .collect(Collectors.toSet());
        System.out.println(setInt);
        Set<Integer>setInt2 = intList.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toSet());

        System.out.println("Zadanie 15");
        Random random1 = new Random();
        List<String> randomString = intList.stream()
                .map(num->{
                    StringBuilder sb = new StringBuilder();
                    for(int i = 0; i < num;i++){
                        char c = (char)(random1.nextInt(26) + 'a');
                        sb.append(c);
                    }
                    return sb.toString();
                }).collect(Collectors.toList());
        System.out.println(randomString);


    }
}
