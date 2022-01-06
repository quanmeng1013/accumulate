package stream.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamCount {
    public static void main(String[] args) {
        Predicate<Integer> p = num -> num % 2 == 0;
        List<Integer> list = Arrays.asList(3,4,6);
        System.out.println("Count: " + list.stream().filter(p).count());
    }
}
