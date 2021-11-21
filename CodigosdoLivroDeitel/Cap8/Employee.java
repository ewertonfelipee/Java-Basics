package CodigosdoLivroDeitel.Cap8;


public class Employee
{
    private String firstName;
        String lastName;
        Date birthDate;
        Date hireDate; // variaveis de instancia referencias a classe Date

    // construtor para inicializar nome, data de nascimento e data de contratacao
    public Employee(String firstName, String lastName, Date birthDate, 
        Date hireDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    // converte Employee em formato de string
    public String toString()
    {
        return String.format("%s, %s    Hired: %s  Birthday:   %s", 
            lastName, firstName, hireDate, birthDate);
    }
} // fim da classe
