package az.iktlab.javasiplesson.lesson14;

import java.util.Random;

public class Exe2 {
    public static void main(String[] args) {
        int[] ages = new int[10_000_000];
        int[] counts = new int[150];
        Random r = new Random();
        for (int i = 0; i < 10_000_000; i++) {
            ages[i] = r.nextInt(150);
        }

        for (int age : ages) {
            counts[age]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "-" + counts[i]);
        }
    }
}
