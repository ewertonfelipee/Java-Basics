package basics;
import java.util.Scanner;

public class Meteoros {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int N; // contador
        int i; //incrementador
        int x1, x2, y1, y2; // fazenda
        int x,y; //meteorito
        int contador;
        do{
            x1 = teclado.nextInt();
            y1 = teclado.nextInt();
            x2 = teclado.nextInt();
            y2 = teclado.nextInt();
            if(x1 != 0 || y1 != 0 || x2 != 0 || y2 != 0){
                N = teclado.nextInt();
                contador = 0;
                for(i = 0; i < N; i++){

                    x = teclado.nextInt();
                    y = teclado.nextInt();
                    if(x >= x1 && x <= x2 && y >=y2 && y <=y1) {
                        System.out.println("Dentro da fazenda");
                        contador++;
                    }
                }
                System.out.printf("O numero de meteoros caidos dentro da fazenda eh: %d", contador);
                System.out.println("");
            }
        }while(x1 != 0 || y1 != 0 || x2 != 0 || y2 != 0);
    }
}
