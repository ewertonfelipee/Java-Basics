package basics;

import java.util.Scanner;

public class SquareSides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides =  new int[length];
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt();
        }
        //your code goes here
        for(int i = 0; i < length; i++){
            sides[i] *=sides[i];
            System.out.println(sides[i]);
        }
    }
}
