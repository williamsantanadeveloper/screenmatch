package desafio.desafio27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(12);
        numbers.add(2);
        numbers.add(-3);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
