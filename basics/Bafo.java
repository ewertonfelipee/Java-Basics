package basics;
import java.util.Scanner;

public class Bafo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int R, A, B, test = 0;
        int tA, tB;
        do{
            R = teclado.nextInt();
            if(R != 0){
                test++;
                tA = 0;
                tB = 0;
                for(int i = 0; i < R; i++){
                    A = teclado.nextInt();
                    B = teclado.nextInt();
                    tA += A;
                    tB += B;
                }
                System.out.printf("Teste %d:", test);
                if(tA > tB){
                    System.out.println("Aldo");
                }
                else{
                    System.out.println("Beto");
                }
                System.out.println("");
            }
        }while (R != 0);
    }
}
