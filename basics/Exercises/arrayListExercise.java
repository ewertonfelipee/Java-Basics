package basics;
import java.util.*;

public class arrayListExercise {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        while(numbers.size() < 3){
            int num = teclado.nextInt();
            numbers.add(num);

            sum += num;
        }
        System.out.print(sum / numbers.size());
    }
}
