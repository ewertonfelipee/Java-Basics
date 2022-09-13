package basics;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;

        //set the age via Setter
        student.setAge(age);

        if(age < 0){
            student.setAge(0);
            System.out.println("Invalid age");
        }
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}

class Student {

    public String name;
    private int age;

    public int getAge() {
        return age;

    }
    public void setAge(int age) {
        this.age = age;

    }
}
