
package streamapidemo.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterBasedOnLengthOfWord {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Lasantha","Kamal","Nima","Jaga","Jay","Sue","Bn");
        List<String> words = name.stream().filter(word->word.length()>3).collect(Collectors.toList());
        System.out.println(words);
    }
}
