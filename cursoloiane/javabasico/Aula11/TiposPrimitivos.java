package cursoloiane.javabasico.Aula11;

public class TiposPrimitivos {
    public static void main(String[] args){
        long x = 2000000000;

        char c = 219;

        int interrogacao = 0x3F;

        int i = 0b110110;

        System.out.println("x: " + x);

        System.out.println("c: " + c);

        System.out.printf("i: %c\n", i);

        System.out.printf("Hex: %x\n", i);

        System.out.printf("Dec: %d\n", i);

        System.out.printf("Oct: %o\n", i);

        System.out.printf("interrogacao: %c\n", interrogacao);
    }
}
