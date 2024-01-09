package Java基礎.part2;
import java.util.Scanner;
public class ScanInteger {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値：");
        int x =stdIn.nextInt();
        System.out.println(x + "と入力しましたね。");
    }
}
