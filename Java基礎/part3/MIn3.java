package Java基礎.part3;
import java.util.Scanner;
public class MIn3 {
    public static void main(String[] args){
        Scanner stdIn =new Scanner(System.in);
        System.out.print("変数A:");  int a =stdIn.nextInt();
        System.out.print("変数B:");  int b =stdIn.nextInt();
        System.out.print("変数C:");  int c =stdIn.nextInt();

        int min = a;
        if(b < min)min=b;
        if(c < min)min=c;

        System.out.println("最小値は" + min + "です");
    }
}
