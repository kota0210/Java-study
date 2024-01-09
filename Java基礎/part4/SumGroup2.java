package Java基礎.part4;
import java.util.Scanner;
public class SumGroup2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数値を加算します。");
        int total = 0;

        Outer:
            for(int i =1; i <= 10; i++){
                System.out.println("・第" + i +"グループ");
                for(int j = 1; j < 5; j++){
                    System.out.print("整数：");
                    int t = stdIn.nextInt();
                    if(t == 99999)
                        break Outer;
                    else if(t == 88888)
                        continue Outer;
                    total += t;
                }
            }
            System.out.println("/n合計は" + total + "です。");
    }
}
