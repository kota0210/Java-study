package Java応用.ラムダ式;

public class SimpleExample {
    public static void main(String[] args) {
        class Person implements SayHello {
            public void hello(){
                System.out.println("こんにちは");
            }
            }
            Person p = new Person();
        Greeting.greet(p);
    }

}
interface SayHello {
    public void hello();
}

class Greeting {
    static void greet (SayHello s){
        s.hello();
    }
}


