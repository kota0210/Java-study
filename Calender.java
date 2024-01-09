import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
日付と就業時間を記録、コメントする
月毎にファイルにまとめる
就業日程を設定し、記録を簡易的にする
*/

public class Calender {
    public static void main(String[] args) throws ParseException {
        //日付を入力してデータとして記録
        Scanner stdIn = new Scanner(System.in);
        System.out.println("日付を入力して下さい：（例　2023-07-07)");
        String strDate = stdIn.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(strDate);


    }
}

//コメントを入力する
class comment{
    Scanner stdIn = new Scanner(System.in);

}