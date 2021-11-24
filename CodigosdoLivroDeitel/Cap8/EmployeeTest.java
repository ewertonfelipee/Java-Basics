package CodigosdoLivroDeitel.Cap8;


public class EmployeeTest
{
    public static void main(String[] args)
    {   
        //mostra que a contafem eh 0 antes de criar Employees
        System.out.printf("%nEmployee before instantiation: %d%n",
            Employee.getCount());

        // cria objetos da classe Date
        Date birthe1 = new Date(5, 23, 1998);
        Date hiree1 = new Date(7, 11, 2022);
        Date birthe2 = new Date(10, 12, 1972);
        Date hiree2 = new Date(9, 15, 2004);

        // cria objetos da classe Employee
        Employee e1 = new Employee("Ewerton", "Felipe", birthe1, hiree1);
        Employee e2 = new Employee("Maria", "Betania", birthe2, hiree2);

        // mostra que a contagem eh 2 depois de criar dois Employess
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out. printf("via Employee.getCount(): %d%n", Employee.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
            e1.getFirstName(), e1.getLastName(), 
            e2.getFirstName(), e2.getLastName());
    }
} // fim da classe
