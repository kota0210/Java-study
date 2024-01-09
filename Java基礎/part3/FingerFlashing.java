package Java基礎.part3;
import java.util.Random;
public class FingerFlashing {
    public static void main(String[] args){
        Random rand = new Random();

        System.out.println("コンピュータが生成した手：");
        int hand = rand.nextInt(3);

        switch(hand){
            case 0: System.out.println("グー"); break;
            case 1: System.out.println("チョキ"); break;
            case 2: System.out.println("パー"); break;
        }
    }
}