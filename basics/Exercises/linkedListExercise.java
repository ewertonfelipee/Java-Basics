package basics;
import java.util.*;


public class linkedListExercise {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<String>();
        while(words.size() < 5){
            String word = teclado.next();
            words.add(word);
            if(word.length() > 4){
                System.out.println(word);
            }
        }
    }
}
