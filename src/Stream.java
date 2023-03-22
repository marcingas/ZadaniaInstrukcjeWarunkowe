import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {


        Random random = new Random();
        IntStream intStream = IntStream.generate(()->random.nextInt(100))
                        .limit(100);
        List<Integer> intList = intStream
                .boxed()
                .collect(Collectors.toList());

        System.out.println(intList);
    }
}
