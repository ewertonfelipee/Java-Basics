package cursoloiane.javabasico.Aula13;
import java.util.Scanner;


public class OperadoresAritmeticos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("digite o primeiro valor: ");
        double num1 = input.nextDouble();
        System.out.print("digite o segundo valor: ");
        double num2 = input.nextDouble();

        System.out.print("digite o primeiro nome: ");
        String primeironome = input.next();
        System.out.print("digite o segundo nome: ");
        String segundonome = input.next();

        double resultado = num1 + num2;

        double resultado2 = num1 - num2;

        double resultado3 = num1 * num2;

        double resultado4 = num1 / num2;

        double resultado5 = num1 % num2;

        String nomecompleto = primeironome + " " + segundonome;


        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
        System.out.println("seu nome eh: " + nomecompleto);

    }
}
