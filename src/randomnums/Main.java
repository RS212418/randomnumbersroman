package randomnums;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("first random int is " + random.nextInt(10));
        System.out.println("First Random double is " + random.nextDouble());

        int min = 2;
        int max = 15;
        int newRandom = random.nextInt((max - min) + 1) + min;
        System.out.println(newRandom);

        System.out.println(Math.random());
        int rand = (int) (Math.random() * 10);
        System.out.println(rand);

        System.out.println("Give me a random number");
        int randomnumber;
        randomnumber = randomnumber.nextInt();
        System.out.println("What is your minimum value");
        int min;
        min = min.nextInt();
        System.out.println("What is your maximum value");
        int max;
        max = max.nextInt();
        int newRandom = random.nextInt((max - min) + 1) + min;



    }
}
