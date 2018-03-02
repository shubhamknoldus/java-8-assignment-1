package edu.knoldus.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PrintPrimeUsingLambda {
    public List<Integer> initialList = new ArrayList<>();
    private Predicate<Integer> isPrimePredicate = i -> {
        int x = 2;
        while (x <= i / 2) {
            if (i % x == 0) {
                return false;
            }
            x++;
        }
        return true;
    };

    public PrintPrimeUsingLambda() {
        Random obj = new Random();
        while (initialList.size() < 100) {
            initialList.add(obj.nextInt(100));
        }
    }

    public List<Integer> printPrimeFromList() {
       return initialList.stream()
                .filter(isPrimePredicate)
                .collect(Collectors.toList());
    }
}
