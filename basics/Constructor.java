package basics;// // Create a basics.Constructor class
// public class basics.Constructor{
    
//     int x; // Create a class attribute

//     // Create a class basics.Constructor for the constructor basics.Constructor class
//     public basics.Constructor(int y){
//         x = y; // Set the initial value for the class attribute
//     }

//     public static void main(String[] args){
//         basics.Constructor myObj = new basics.Constructor(25); // Create an object of class basics.Constructor(This Will call the constructor)
//         System.out.println("The Value of x is: " + myObj.x); // Print the value of x
//     }
// }

public class Constructor{

    int CarYear;
    String CarName;

    public Constructor(int year, String name){

        CarYear = year;
        CarName = name;
    }

    public static void main(String[] args){

        Constructor myCar = new Constructor(1999, " Gol Quadrado");
        System.out.println("Model " + myCar.CarName);
        System.out.println("Year " + myCar.CarYear);
    }
}
