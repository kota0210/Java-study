public class SimpleThreadTest3 {
    public static void main(String[] args){
    MyThread3 t = new MyThread3();
    t.start();

    try{
        t.join();
    }catch (InterruptedException e){
        System.out.println(e);
    }
    for(int i = 0;i < 100;i++){
        System.out.println("SimpleThreadTestのmainメソッド(" + i + ")");
    }
}
}
class MyThread3 extends Thread{
    public void run(){
        for(int i = 0;i < 100;i++){
            System.out.println("SimpleThreadTestのrunメソッド(" + i + ")");
        }
    }
}