package basics;
import java.util.Scanner;

public class Uri1178 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] arr = new double[100];

        arr[0] = teclado.nextDouble();
        System.out.printf("N[0] = %.4f\n", arr[0]);
        for(int i = 1; i < 100; i++){
            arr[i] = arr[i-1]/2;
            System.out.printf("N[%d] = %.4f\n",i, arr[i]);
        }
    }
}
