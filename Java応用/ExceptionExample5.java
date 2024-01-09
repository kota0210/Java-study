import java.util.ArrayList;
public class ExceptionExample5 extends Exception{
    public static void main(String[] args){
        SimpleClass obj = new SimpleClass();
        try{
            obj.doSomething();
        }catch(Exception e){
            System.out.println("例外をキャッチしました");
            e.printStackTrace();
        }

    }

    static class SimpleClass{
        void doSomething(){
            int array[] = new int[3];
            array[10] = 99;
            System.out.println("doSomethingメソッドを終了します");
        }
    }
}
