public class Array {
    public static void main(String[] args) {

        Classe fj11 = new Classe();
//        Students students = new Students();
        fj11.students = new Students[2];

        fj11.students[0] = new Students();
        fj11.students[0].setName("Ewerton");
        fj11.students[0].setGrades(9);

        fj11.students[1] = new Students();
        fj11.students[1].setName("Felipe");
        fj11.students[1].setGrades(8);

        fj11.PrintGrades();
    }
}
