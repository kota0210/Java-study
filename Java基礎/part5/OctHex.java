package Java基礎.part5;
import java.util.Scanner;
public class OctHex {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数：");
        int x = stdIn.nextInt();

        System.out.printf("８進数では%oです", x);
        System.out.println();
        System.out.printf("16進数では%xです", x);
        System.out.println();
    }
}
