package basics;

import java.util.Scanner;

//your code goes here


class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(BinaryConverter.toBinary(x));
    }

}

public class BinaryConverter{
    public static String toBinary(int num){
        String binary = "";
        while(num > 0){
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}
