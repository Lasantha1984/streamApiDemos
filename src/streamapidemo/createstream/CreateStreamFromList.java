package streamapidemo.createstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class CreateStreamFromList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Stream<String> fruitStream = fruits.stream();
        fruitStream.forEach(System.out::println);
    }
}
