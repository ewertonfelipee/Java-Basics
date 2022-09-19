package basics;
import java.util.Scanner;

public class printMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();


        int matrix[][] = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                matrix[i][j] = sc.nextInt();
                System.out.print(matrix[i][j]);
            }
        }
    }
}
