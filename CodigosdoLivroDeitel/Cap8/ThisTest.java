package CodigosdoLivroDeitel.Cap8;

// this utilizado implicita e explicitamente para referencia a membros de um objeto.
public class ThisTest 
{    
    public static void main(String[] args)
    {
        SimpleTime test = new SimpleTime(15, 30, 19);
        System.out.println(test.buildString());
    }
} // fim da clase ThisTest

class SimpleTime
{
    private
        int hour; // varaiveis de instancia
        int minute; // varaiveis de instancia
        int second; // varaiveis de instancia

    /* se o construtor utilizar nomes de parametro indenticos a
    nomes de variaveis de instancia a referencia "this" sera exigida
    para distinguir entre os nomes */
    public SimpleTime(int hour, int minute, int second)
    {
        this.hour = hour; // configura a hora do objeto "this"
        this.minute = minute; // configura o minuto do objeto "this"
        this.second = second; // configura o segundo do objeto "this"
    }

    // utilizam "this" explicito e implicito para chamar toUniversalString
    public String buildString()
    {
        return String.format("%24s: %s%n%24s: %s",
            "this.toUniversalString()", this.toUniversalString(),
            "toUniversalString()", toUniversalString());
    }

    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        // "this" nao eh requerido aqui para acessar variaveis de instancia,
        // porque o metodo nao tem variaveis locais com os mesmos
        // nomes das variaveis de instancia
        return String.format("%02d: %02d: %02d", hour, minute, second);
        // return String.format("%02d:%02d:%02d", this.hour , this.minute , this.second );
    }
} // fim da classe SimpleTime
