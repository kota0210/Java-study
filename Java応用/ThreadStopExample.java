public class ThreadStopExample {
    public static void main(String[] args){
        MyThread4 t = new MyThread4();
        t.start();

        try{
            Thread.sleep(5);
        }catch(Exception e){
            System.out.println(e);
        }
        t.running = false;
     }
}

class MyThread4 extends Thread{
    public boolean running = true;
    public void run(){
        while(running){
            System.out.print("*");
        }
        System.out.println("runメソッドを終了します。");
    }

}
