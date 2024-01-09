package Java基礎.part4;
import java.util.Scanner;
import java.util.Random;
public class Kazuate2digits {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int x = 10 + rand.nextInt(90);
        int n;
        do{
            System.out.println("数値を入力して下さい：");
             n =  stdIn.nextInt();
            if( x > n)
                System.out.println("もっと大きい数です。");
            else if(n > x)
                System.out.println("もっと小さい数です。");
        }while(x != n);

        System.out.println("正解です。");


    }
}
