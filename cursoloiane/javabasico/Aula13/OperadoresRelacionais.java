package cursoloiane.javabasico.Aula13;

import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o primeiro valor: ");
        double num1 = input.nextDouble();
        System.out.print("digite o segundo valor: ");
        double num2 = input.nextDouble();

        System.out.println("Valor1 == Valor2: " + (num1 == num2));
        System.out.println("Valor1 != Valor2: " + (num1 != num2));
        System.out.println("Valor1 <= Valor2: " + (num1 <= num2));
        System.out.println("Valor1 >= Valor2: " + (num1 >= num2));
        System.out.println("Valor1 < Valor2: " + (num1 < num2));
        System.out.println("Valor1 > Valor2: " + (num1 > num2));
    }
}
