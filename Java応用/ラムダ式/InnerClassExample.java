package Java応用.ラムダ式;

public class InnerClassExample {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.doSomething();
    }
}

class Outer{
    private String message = "Outerクラスのpraivateなインスタンス変数です";

    void doSomething(){
        class Inner{
            void print(){
                System.out.println("innerクラスのprintメソッドが呼ばれました");
                System.out.println(message);
            }
        }

        Inner inner = new Inner();
        inner.print();
    }
}
