package basics;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String[] str = new String[5];

        System.out.println("Digite as strings: ");
        for(int i = 0; i < str.length; i++){
            str[i] = teclado.nextLine();
        }
        System.out.println("");
        System.out.println("As strings sao: ");
        for(int i = 0; i < str.length; i++){
            System.out.println("str na posicao " + i + ":" + str[i]);
        }
    }
}
