package Java基礎.part6;
import java.util.Random;
import java.util.Scanner;
public class MonthCAI {
    public static void main(String[] args){
        Scanner stdIn =new Scanner(System.in);
        Random rand = new Random();

        String[] monthString = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        System.out.println("月名を英語で入力して下さい。");
        System.out.println("ただし先頭は大文字、それ以降は小文字で入力して下さい。");

        int retry;
        int last = -1;

        do{
            int month;
            do{
                month = rand.nextInt(12);
            }while(month == last);
            last = month;

            while(true){
                System.out.print((month + 1) + "月：");
                String s = stdIn.next();

                if(s.equals(monthString[month])) break;
                System.out.println("違います。");
            }
            System.out.print("正解です。もう一度？　1•••YES/0•••NO：");
            retry = stdIn.nextInt();
        }while(retry == 1);



    }
}
