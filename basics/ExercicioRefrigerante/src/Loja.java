import java.util.Scanner;
public class Loja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MaquinaRefri m = new MaquinaRefri();
        int opcao, res;
        float valor;

        do{
            System.out.println(m.mostraInfo());
            System.out.println("Digite 99 para inserir credito");
            System.out.println("Digite -1 para sair");
            System.out.println("Digite o numero do refri para comprar [0-4]");
            opcao = teclado.nextInt();
            switch (opcao){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    res = m.comprar(opcao);
                    if(res == 0){
                        System.out.println("Aproveite seu refrigerante");
                    }
                    else if(res == -1){
                        System.out.println("Seu saldo eh insuficiente. Insira mais credito");
                    }
                    else{
                        System.out.println("Desculpe. Sem estoque.");
                    }
                    break;
                case 99:
                    System.out.println("Digite o valor para inserir: ");
                    valor = teclado.nextFloat();
                    m.inserirCredito(valor);
                    break;
                case -1:
                    System.out.println("Obrigado por usar");
                    System.out.println("Receba seu troco"+m.solicitarTroco());
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao != -1);
    }
}