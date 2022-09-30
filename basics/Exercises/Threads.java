package basics;

public class Threads {
    public static void main(String[] args) {
        Name name = new Name();
        name.setPriority(2);
        //System.out.println("Priority of thread name is: " + name.getPriority());

        Welcome welcome = new Welcome();
        welcome.setPriority(7);
        //System.out.println("Priority of thread welcome is: " + welcome.getPriority());
        welcome.start();
        name.start();

    }
}

class Welcome extends Thread{
    public void run(){
        System.out.println("Welcome!");
    }
}

class Name extends Thread{
    public void run(){
        System.out.println("Please enter your name");
    }
}
