package cursoloiane.javabasico.Aula12;
import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();
        System.out.printf("Seu nome eh: %s\n", nome);
        System.out.printf("Seu nome eh: %d\n", idade);
        System.out.printf("Seu nome eh: %.2f\n", altura);
    }
}
