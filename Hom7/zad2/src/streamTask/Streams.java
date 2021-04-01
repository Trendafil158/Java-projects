package streamTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "d", "ef", "123456");
        Stream<String> stringStream = list.stream().map(String::toUpperCase).sorted();
        List<String> result = stringStream.collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
