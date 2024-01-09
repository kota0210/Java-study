package Java基礎.part3;
import java.util.Scanner;
public class Measure1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("変数A:");  int a =stdIn.nextInt();
        System.out.print("変数B:");  int b =stdIn.nextInt();

        if(!(a % b ==0))
            System.out.println("BはAの約数ではありません。");
        else
            System.out.println("BはAの約数です。");
    }
}
