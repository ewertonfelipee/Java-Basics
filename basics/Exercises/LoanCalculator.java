package basics;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
        int payment1 = amount / 10;
        int remaining1 = amount - payment1;

        int remaining2 = remaining1 / 10;
        remaining2 = remaining1 - remaining2;

        int remaining3 = remaining2 / 10;
        remaining3 = remaining2 - remaining3;
        System.out.println(remaining3);
    }
}
