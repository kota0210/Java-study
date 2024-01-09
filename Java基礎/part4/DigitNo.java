package Java基礎.part4;
import java.util.Scanner;
public class DigitNo {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("正の整数値の桁数を求めます。");
        int x;
        do{
            System.out.println("性の整数値：");
            x = stdIn.nextInt();
        }while( x <= 0);

        int digits = 0;
        while(x > 0){
            digits++;
            x /= 10;
        }
        System.out.println("桁数は" + digits + "です。");

    }
}
