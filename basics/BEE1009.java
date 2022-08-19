import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        String name;
        double salary, totalSale;
        System.out.println("Digite seu nome: ");
        name = teclado.nextLine();
        System.out.println("Digite o salario: ");
        salary = teclado.nextDouble();
        System.out.println("Digite as vendas: ");
        totalSale = teclado.nextDouble();
        
        double totalSalary = (totalSale*0.15) + salary;
        System.out.printf("R$%.2f", totalSalary);
    }
}
