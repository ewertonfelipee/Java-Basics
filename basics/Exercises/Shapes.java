package basics;
import java.util.Scanner;
abstract class Shape {
    double width;
    abstract void area();
}

class Square extends Shape{
    double width;
    public Square(double width){
        this.width = width;
    }
    @Override void area(){
        System.out.println(width*width);
    }
}
class Circle extends Shape{
    double width;
    public Circle(double width){
        this.width = width;
    }
    @Override void area(){
        System.out.println(Math.PI*width*width);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}