public class BombaDeCombustivel {
    private String combustivel;
    private float precoLitro;
    private float qtdeLitros;
    private float valorTotal;
    private boolean emAbastecimento;

    public BombaDeCombustivel(String tipoCombustivel, float precoLitro){

        this.combustivel = tipoCombustivel;
        this.precoLitro = precoLitro;
        this.qtdeLitros = 0f;
        this.valorTotal = 0f;
        this.emAbastecimento = false;
    }

    public void puxarGancho(){
        this.emAbastecimento = true;
        System.out.println("Bomba "+this.combustivel+" pronta para abastecer");
    }

    public void voltarGancho(){
        this.emAbastecimento = false;
        System.out.println("+==================================+");
        System.out.println("|   Posto do Ewerton - recibo.    |");
        System.out.println("+==================================+");
        System.out.println("|   Combustivel:    "+this.combustivel);
        System.out.println("|   Preco Litro R$  "+this.precoLitro);
        System.out.println("|   Litros          "+this.qtdeLitros);
        System.out.println("|   Valor total R$  "+this.valorTotal);
        System.out.println("+==================================+");
    }

    public void abastecerPorLitro(float litros){
        if(this.emAbastecimento){
            this.qtdeLitros = litros;
            this.valorTotal = this.qtdeLitros * this.precoLitro;
            System.out.println("Bomba "+combustivel+" em abastecimento");
        }
        else{
            System.out.println("Tire o bico do gancho");
        }
    }

    public void abastecimentoPorValor(float valor){
        if(this.emAbastecimento){
            this.valorTotal = valor;
            this.qtdeLitros = this.valorTotal / this.precoLitro;
            System.out.println("Bomba "+combustivel+" em abastecimento");
        }
        else{
            System.out.println("Tire o bico do gancho");
        }
    }
}
