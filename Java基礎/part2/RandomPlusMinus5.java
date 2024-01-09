package Java基礎.part2;

import java.util.Scanner;
import java.util.Random;
public class RandomPlusMinus5 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("整数値は：");
        double x = stdIn.nextDouble();
        System.out.println(x - 5 + rand.nextDouble(11));
    }
}
