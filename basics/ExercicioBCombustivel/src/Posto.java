//  Exercicio Bomba de Combustivel
public class Posto {
    public static void main(String[] args) {
        BombaDeCombustivel b1, b2;
        b1 = new BombaDeCombustivel("Alcool", 3.50f);
        b2 = new BombaDeCombustivel("Gas", 4.50f);

        b1.puxarGancho();
        b1.abastecimentoPorValor(50.00f);
        b1.voltarGancho();

        b2.puxarGancho();
        b2.abastecerPorLitro(60.00f);
        b2.voltarGancho();
    }
}