package Java基礎.part4;
import java.util.Scanner;
public class ThreeDigit {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int x;
        do{
            System.out.print("3桁の整数値：");
            x = stdIn.nextInt();
        }while(x < 100 || x > 999);

        System.out.println(x + "と入力");
    }
}
