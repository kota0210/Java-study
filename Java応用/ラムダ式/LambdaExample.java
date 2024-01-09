package Java応用.ラムダ式;

public class LambdaExample {
    static void printout(SimpleInterface i){
        System.out.println(i.doSomething(2));
    }
    public static void main(String[] args){
        printout(n -> n+1);
    }
}

interface  SimpleInterface{
    public int doSomething(int n);
}
