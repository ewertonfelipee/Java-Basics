package basics;

import java.util.Scanner;
public class SafetyFirst
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int password;
        do{
            password = read.nextInt();
            System.out.println("Write password");
        }while(password != 8819);
    }
}
