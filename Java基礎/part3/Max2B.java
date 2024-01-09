package Java基礎.part3;
import java.util.Scanner;

public class Max2B {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("変数A:");  int a =stdIn.nextInt();
        System.out.print("変数B:");  int b =stdIn.nextInt();

        double max = a > b ? a:b;
        System.out.println("大きい方の値は" + max + "です");

    }
}
