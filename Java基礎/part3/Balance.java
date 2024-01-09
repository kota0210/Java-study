package Java基礎.part3;
import java.util.Scanner;
public class Balance {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("変数A:");  int a =stdIn.nextInt();
        System.out.print("変数B:");  int b =stdIn.nextInt();

        if(a > b)
            System.out.println("aの方が大きいです。");
        else if(b > a)
            System.out.println("bの方が大きいです。");
        else
            System.out.println("aとbは同じ値です。");
    }
}
