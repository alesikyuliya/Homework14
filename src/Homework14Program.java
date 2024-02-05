import java.util.Random;

public class Homework14Program {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100_000) + 11;
        System.out.println("Random number = " + randomNumber);

        int iterations = String.valueOf(randomNumber).length();
        int sumDigits = 0;
        for (int i = 0; i < iterations; i++) {
            sumDigits += randomNumber % 10;
            randomNumber /= 10;
        }

        System.out.println("Sum of numbers of digits = " + sumDigits);
    }
}
