package CodigosdoLivroDeitel.Cap8;


public class Employee
{
    private
        static int count = 0;
        String firstName;
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

        ++count;
        System.out.printf("Employee constructor: %s %s; Birthday: %s Hire: %s; count = %d%n", 
            firstName, lastName, birthDate, hireDate, count);
    }

    // obtem o primeiro nome
    public String getFirstName()
    {
        return firstName;
    }

    //obtem o ultimo nome
    public String getLastName()
    {
        return lastName;
    }

    // obtem a data de nascimento
    public Date getBirthDate()
    {
        return birthDate;
    }

    // obtem a data de contratacao
    public Date getHireDate()
    {
        return hireDate;
    }

    // metodo estatico para obter valor de contagem de static
    // retorna o numero de objetos Employee que foram criados ate agora
    public static int getCount()
    {
        return count;
    }

    // converte Employee em formato de string
    // public String toString()
    // {
    //     return String.format("%s, %s    Hired: %s  Birthday:   %s", 
    //         lastName, firstName, hireDate, birthDate);
    // }
} // fim da classe
