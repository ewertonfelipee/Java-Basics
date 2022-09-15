package basics;
import java.util.Scanner;

public class MinParameter {
    public static int minFunc(int a, int b){
        int min;
        if(a > b){
            min = b;
        }
        min = a;
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(minFunc(a, b));
    }
}
