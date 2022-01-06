package stream.tutorial;

import java.util.Arrays;
import java.util.List;

public class StreamFindAnyFindFirst {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("G","B","F","E");
        String any = list.stream().findAny().get();
        System.out.println("FindAny: "+ any);
        String first = list.stream().findFirst().get();
        System.out.println("FindFirst: "+ first);
    }
}
