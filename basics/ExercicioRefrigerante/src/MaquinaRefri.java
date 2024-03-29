public class MaquinaRefri {

    private Refrigerante lista[];
    private float        credito;

    public MaquinaRefri(){
        lista = new Refrigerante[5];
        lista[0] = new Refrigerante("Coca-Cola", "Cola", 7.00f, 15);
        lista[1] = new Refrigerante("Sprite", "limao", 6.50f, 10);
        lista[2] = new Refrigerante("Fanta", "Laranja", 6.00f, 10);
        lista[3] = new Refrigerante("Fanta", "Uva", 5.00f, 5);
        lista[4] = new Refrigerante("Antartica", "Guarana", 6.00f, 12);
        this.credito = 0.0f;
    }

    public void inserirCredito(float valor){
        this.credito +=valor;
    }

    public float solicitarTroco(){
        float troco = this.credito;
        this.credito = 0.0f;
        return troco;
    }

    // retorn 0-sucesso -1:sem credito -2:sem estoque
    public int comprar(int numRefri) {
        // numRefri posicao do vetor
        if (this.credito >= lista[numRefri].getPreco()) {
            if (lista[numRefri].getQtde() > 0) {
                this.credito -= lista[numRefri].getPreco();
                int novaQtde = lista[numRefri].getQtde() - 1;
                lista[numRefri].setQtde(novaQtde);
                return 0;
            } else {
                return -2;
            }
        }
        else {
            return -1;
        }
    }

    public String mostraInfo(){
        String str = "";
        str +=  "+================================+  \n" +
                "|  Maquina de Refrigerante.        |\n" +
                "+================================+  \n" +
                "|  Credito R$ : "+this.credito +   "\n";

        for(Refrigerante r : lista){
            str += "|   "+r.getNome()+" "+r.getSabor() +" R$ "+r.getPreco()+"\n";
        }

        str +=  "+================================+  \n";

        return str;

    }
}
