package CodigosdoLivroDeitel.Cap8;
//Declarando um tipo enum com um construtor e campos de instancia explicitos
// e metodos de acesso para esses campos

public enum Book 
{
    // Declara constantes do tipo enum
    OML("O Manifesto Libertario"),
    OHMRB("O Homem Mais Rico da Babilonia"),
    SH("Sherlock Holmes");

    // campos de instancia
    private final String title;

    // construtor enum
    Book(String title)
    {
        this.title = title;
    }

    // acessor para titulo de campos de instancia
    public String getTitle()
    {
        return title;
    }

} // fim do enum book
