package basics.Threads;
// 1 way to create a thread
class Main{
    public static void main(String[] args) {
        Loader loader = new Loader();
        loader.start();
    }
}

public class Loader extends Thread{
    @Override
    public void run() {
        System.out.println("hello");
    }
}