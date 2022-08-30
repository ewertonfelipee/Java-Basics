package basics;

public class StringsTest {
    public static void main(String[] args){
        // cria duas referencias que apontam para enderecos
        // diferentes da mememoria
        String s1 = new String("hello");
        String s2 = new String("hello");

        if(s1 == s2){
            System.out.println("apontam para o mesmo local");
        }
        else{
            System.out.println("apontam para locais distintos");
        }

        // Deve-se sempre usar equals para comparar objetos
        if(s1.equals(s2)){
            System.out.println("Iguais lexicograficamente");
        }
        else{
            System.out.println("Diferentes lexicograficamente");
        }
    }
}
