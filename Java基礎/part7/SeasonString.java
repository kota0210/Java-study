//指定された月も季節を表す文字列を返却するメソッド
package Java基礎.part7;
import java.util.Scanner;
public class SeasonString {

    //--- m月の季節を表す文字列を返却 ---//
    static String seasonOf(int m){
        switch(m){
            case 3: case 4: case 5: return "春";
            case 6: case 7: case 8: return "夏";
            case 9: case 10: case 11: return "秋";
            case 12: case 1: case 2: return "冬";
        }
        return "";   //mが1~12でなければ空の文字列を返却
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int month;
        do{
            System.out.print("何月ですか(1~12)：");
            month = stdIn.nextInt();
        }while (month < 1 || month > 12);

        System.out.println("その月の季節は" + seasonOf(month) + "です");
    }

}
