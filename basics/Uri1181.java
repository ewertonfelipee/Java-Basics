package basics;
import java.util.Scanner;
public class Uri1181 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double[][] matrix = new double[12][12];
        int L = Integer.parseInt(teclado.nextLine());
        // Pega um char
        char T = teclado.nextLine().charAt(0);
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                matrix[i][j] = teclado.nextDouble();
            }
        }

        double res = 0;
        for(int c = 0; c < 12; c++){
            res += matrix[L][c];
        }

        if(T == 'S'){
            System.out.printf("%.1f\n", res);
        }
        else{
            System.out.printf("%.1f", res/12);
        }
    }
}
