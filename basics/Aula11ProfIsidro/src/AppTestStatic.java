public class AppTestStatic {
    public static void main(String[] args) {
        TestStatic t1,t2;
        t1 = new TestStatic();  //t1 eh uma referencia
        t2 = new TestStatic();  //t2 eh uma referencia


        t1.At1 = 100;
        t1.At2 = 1000;

        t2.At1 = 15;
        t2.At2 = 150;

        TestStatic.At3 = 5;

        System.out.println("Primeira instancia: ");
        t1.printValues();
        System.out.println("Segunda instancia: ");
        t2.printValues();
    }
}