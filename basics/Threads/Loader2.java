package basics.Threads;
// 2 way to create Threads
class Main2{
    public static void main(String[] args) {
        Thread thread = new Thread(new Loader2());
        thread.start();
    }
}

public class Loader2 implements Runnable{
    public void run(){
        System.out.println("hello");
    }
}
