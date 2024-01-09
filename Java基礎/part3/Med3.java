package Java基礎.part3;
import java.util.Scanner;
public class Med3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("変数A:");
        int a = stdIn.nextInt();
        System.out.print("変数B:");
        int b = stdIn.nextInt();
        System.out.print("変数C:");
        int c = stdIn.nextInt();

        int med;
        if (a >= b) {
            if (b >= c)
                med = b;
            else if(a <= c)
                med = a;
            else
                med = c;
        } else if (b >= a) {
            if (a >= c)
                med = a;
            else
                med = c;
        } else if (a > c)
            med = a;
        else if (b > c)
            med = c;
        else
            med = b;
        System.out.println("中央値は" + med + "です。");
    }
}
