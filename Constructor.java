// // Create a Constructor class
// public class Constructor{
    
//     int x; // Create a class attribute

//     // Create a class Constructor for the constructor Constructor class
//     public Constructor(int y){
//         x = y; // Set the initial value for the class attribute
//     }

//     public static void main(String[] args){
//         Constructor myObj = new Constructor(25); // Create an object of class Constructor(This Will call the constructor)
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
