package basics;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int N = 2, M = 2;
        int[][] m = new int[N][M];

        System.out.println("Preenchendo a matriz: ");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                m[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Imprimindo na forma de matriz: ");
        for(int l = 0; l < N; l++){
            for(int c = 0; c < M; c++){
                System.out.printf("%3s", m[l][c]);
            }

            System.out.println("");
        }
    }
}
