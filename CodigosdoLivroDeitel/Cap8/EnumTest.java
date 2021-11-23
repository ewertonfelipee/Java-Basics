package CodigosdoLivroDeitel.Cap8;
import java.util.EnumSet;


public class EnumTest
{
    public static void main(String[] args)
    {
        System.out.println("All Books: ");

        //imprime todos os livros em enum book
        for(Book book : Book.values())
            System.out.printf("%-10s%-45s%n", book, 
                book.getTitle());

        System.out.printf("%nDisplay a range of enum constants:%n");

        // imprime os 3 livros | o metodo range da classe EnumSet exibie um intervalo das constantes do enum book
        for(Book book : EnumSet.range(Book.OML, Book.OHMRB))
            System.out.printf("%-10s%-45s%n", book, 
                book.getTitle());
    }
} // fim da classe EnumTest
