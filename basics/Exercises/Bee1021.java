import java.util.Scanner;

public class Bee1021 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int saqueInt, saqueDec;
        int qntd100, qntd50, qntd20, qntd10, qntd5, qntd2, qntd1, qntd050, qntd025, qntd010, qntd005, qntd001;
        int resto;
        
        double valorSaque = teclado.nextDouble();
        saqueInt = (int)valorSaque;
        valorSaque -= saqueInt;
        
        saqueDec = (int)(valorSaque * 100);
        
        qntd100 = saqueInt/100;
        resto = saqueInt%100;
        
        qntd50 = resto/50;
        resto = resto%50;
        
        qntd20 = resto/20;
        resto = resto%20;
        
        qntd10 = resto/10;
        resto = resto%10;
        
        qntd5 = resto/5;
        resto = resto%5;
        
        qntd2 = resto/2;
        qntd1 = resto%2;
        
        qntd050 = saqueDec / 50;
        resto = saqueDec % 50;
        
        qntd025 = resto / 25;
        resto = resto % 25;
        
        qntd010 = resto / 10;
        resto = resto % 10;
        
        qntd005 = resto / 5;
        qntd001 = resto % 5;
        
        System.out.println("NOTAS: ");
        System.out.println(qntd100 + " notas(s) de RS100.00");
        System.out.println(qntd50 + " notas(s) de RS50.00");
        System.out.println(qntd20 + " notas(s) de RS20.00");
        System.out.println(qntd10 + " notas(s) de RS10.00");
        System.out.println(qntd5 + " notas(s) de RS5.00");
        System.out.println(qntd2 + " notas(s) de RS2.00");
        
        System.out.println("MOEADAS: ");
        System.out.println(qntd1 + " moedas(s) de RS1.00");
        System.out.println(qntd050 + " moeadas(s) de RS0.50");
        System.out.println(qntd025 + " moeadas(s) de RS0.25");
        System.out.println(qntd010 + " moeadas(s) de RS0.10");
        System.out.println(qntd005 + " moeadas(s) de RS0.05");
        System.out.println(qntd001 + " moeadas(s) de RS0.01");
    }
}
