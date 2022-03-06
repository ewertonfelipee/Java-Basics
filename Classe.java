public class Classe {
    Students[] students = new Students[2];

    void PrintGrades(){
        for(int i = 0; i < this.students.length; i++){
            Students students = this.students[i];
            System.out.println(students.getName());
            System.out.println(students.getGrades());
        }
    }
}
