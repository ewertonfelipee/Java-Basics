public class Time1Test {
    public static void main(String[] args)
    {
        //cria e inicializa um objeto Time1
        Time1 test = new Time1(); // invoca o construtor Time1

        //gera saida de representacoes de string da data/hora
        displayTime("Apos o objeto test ser criado", test);
        System.out.println();

        // altera a data/hora e gera saida da data/hora atualizada
        test.setTime(13, 27, 6);
        displayTime("Apos a chamar setTime", test);
        System.out.println();

        // tenta definir data/hora com valores invalidos
        try 
        {
            test.setTime(99,99,99);// todos os valores fora do intervalo
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
    
        //exibe a data/hora apos uma tentativa de difnir valores invalidos
        displayTime("Apois chamar setTime com valores invalidos", test);

    }

    private static void displayTime(String header, Time1 t)
    {
        System.out.printf("%s%Universal time: %s%nStandard time: %s%n",
            header, t.toUniversalString(), t.toString());
    }

} // fim da classe
