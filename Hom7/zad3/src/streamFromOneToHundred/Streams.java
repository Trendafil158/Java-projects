package streamFromOneToHundred;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i = 1; i <= 100; i++)
        {
            integerList.add(i);
        }
        Stream<Integer> integerStream = integerList.stream();
        String stringIntegerList = integerStream.map(e -> e.toString()).reduce("", String::concat);
        System.out.println(stringIntegerList);

        Random random = new Random();
        List<Integer> integerListSecond = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++)
        {
            integerListSecond.add(random.nextInt(30));
        }
        Stream<Integer> integerStreamSecond = integerListSecond.stream();
        //integerStreamSecond.forEach(p -> System.out.print(p + " "));
        Predicate<Integer> firstCheck = value -> value % 5 == 0;
        Predicate<Integer> secondCheck = value -> value < 15;
        //integerStreamSecond.filter(firstCheck).forEach(System.out::println);
        integerStreamSecond.filter(secondCheck).forEach(System.out::println);
    }
}
