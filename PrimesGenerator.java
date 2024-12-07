package org.example;
import java.util.*;

public class PrimesGenerator implements Iterable<Integer> {
    private final int N;  // количество простых чисел
    private List<Integer> primes;

    public PrimesGenerator(int N) {
        this.N = N; //поле хранит макс. значение.
        this.primes = new ArrayList<>();

        int number = 2;
        while (primes.size() < N) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }
    }

    // Проверка, является ли число простым
    private boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // перебор коллекции.
    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

    // Получение простых чисел в списке
    public List<Integer> getPrimes() {
        return primes;
    }
}
