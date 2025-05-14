import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;

class Primecal {
    public boolean isPrime(BigInteger input) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger i = two;
        while (i.compareTo(input.divide(two)) <= 0) {
            if (input.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
            i = i.add(BigInteger.ONE);
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        long n = 600;
        String filename= "Prime.txt";

        Primecal primecal = new Primecal();

        try (BufferedWriter writer = Files.newBufferedWriter(filename.toPath())) {
            for (long i = 2; i < n; i++) {
                if (primecal.isPrime(BigInteger.valueOf(i))) {
                    System.out.println(i);
                    //BigInteger result = BigInteger.valueOf(2).pow((int)i).subtract(BigInteger.ONE);
                   // System.out.println("Result for " + i + ": " + result);
                    writer.write(i + "\n"); // Write the prime number to the file
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
