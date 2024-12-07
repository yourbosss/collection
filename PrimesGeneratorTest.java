import org.example.PrimesGenerator;
import java.util.*;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int N = 15;

        PrimesGenerator primesGenerator = new PrimesGenerator(N);
        //числа в прямом порядке.
        System.out.println("Простые числа в прямом порядке:");
        Iterator<Integer> primeIterator = primesGenerator.iterator();

        while (primeIterator.hasNext()) {
            System.out.println(primeIterator.next());
        }

        // числа в обратном порядке.
        List<Integer> primes = primesGenerator.getPrimes(); //метод возращает числа в обратном порядке.
        Collections.reverse(primes);
        System.out.println("\nПростые числа в обратном порядке:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
