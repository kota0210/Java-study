package Java基礎.part4;
import java.util.Scanner;

public class PutAsteriskAlt1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("なん個表示させますか：");
        int n = stdIn.nextInt();

        if(n > 0){
            int i = 0;
            while( i < n ){
                if(i % 2 == 0)
                    System.out.println('*');
                else
                    System.out.println('+');
                i++;
            }
            System.out.println();
        }
    }
}
