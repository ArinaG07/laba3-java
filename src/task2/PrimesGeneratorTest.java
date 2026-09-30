package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimesGeneratorTest {
    public static void run() {
        int n = 10;
        PrimesGenerator generator = new PrimesGenerator(n);

        List<Integer> primesList = new ArrayList<>();
        for (int prime : generator) {
            primesList.add(prime);
        }

        System.out.println("Простые числа в прямом порядке:");
        System.out.println(primesList);

        System.out.println("Простые числа в обратном порядке:");
        Collections.reverse(primesList);
        System.out.println(primesList);
    }
}

