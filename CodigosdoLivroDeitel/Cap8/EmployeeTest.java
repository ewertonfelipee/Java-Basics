package CodigosdoLivroDeitel.Cap8;


public class EmployeeTest
{
    public static void main(String[] args)
    {
        Date birth = new Date(5, 23, 1998);
        Date hire = new Date(7, 11, 2022);
        Employee employee = new Employee("Ewerton", "Felipe", birth, hire);

        System.out.println(employee);
    }
} // fim da classe
