public class Refrigerante {

    private String nome;
    private String sabor;
    private float preco;
    private int qtde;

    public Refrigerante(String nomeRefri, String saborRefri, float precoRefri,
                        int qtdeRefri){

        this.nome = nomeRefri;
        this.sabor = saborRefri;
        this.preco = precoRefri;
        this.qtde = qtdeRefri;
    }

    public void setNome(String nomeRefri){
        this.nome = nomeRefri;
    }

    public void setSabor(String saborRefri) {
        this.sabor = saborRefri;
    }

    public void setPreco(float precoRefri) {
        this.preco = precoRefri;
    }

    public void setQtde(int qtdeRefri){
        this.qtde = qtdeRefri;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSabor(){
        return this.sabor;
    }

    public float getPreco(){
        return this.preco;
    }

    public int getQtde(){
        return this.qtde;
    }

}
