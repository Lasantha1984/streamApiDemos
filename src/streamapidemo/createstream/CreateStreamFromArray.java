/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamapidemo.createstream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class CreateStreamFromArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5};
      String [] s = {"Lasantha","Dharshan","Nila"};

        IntStream numberStream = Arrays.stream(numbers);
        numberStream.forEach(System.out::println);
        
        Stream stringStream = Arrays.stream(s);
        stringStream.forEach(System.out::println);
        
    }
    
}
