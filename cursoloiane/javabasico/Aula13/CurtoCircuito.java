package cursoloiane.javabasico.Aula13;

public class CurtoCircuito {
    public static void main(String[] args){
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; // verifica o falso e o verdadeiro para dar o resultado
        boolean resultado2 = falso && verdadeiro; // verifica o falso e ja atribui falso a variavel

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
