package test;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random(10);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(10)); //3030667814
        }
        System.out.println();
        Random random1 = new Random(10);
        for (int i = 0; i < 10; i++) {
            System.out.print(random1.nextInt(10)); //3030667814
        }
    }
}
