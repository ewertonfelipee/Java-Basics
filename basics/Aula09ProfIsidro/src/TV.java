public class TV {
    String marca;
    boolean ligada;
    double preco;
    int volume;
    int canal;
    double tamanho;

    void ligar(){
        ligada = true;
        System.out.println("A TV da "+marca+" esta ligada");
    }

    void aumentarVolume(){
        if(ligada){
            volume++;
            System.out.println(volume);
        }
        else{
            System.out.println("tv desligada, ligue a tv");
        }
    }

    void avancarCanal(){
        if(ligada){
            canal++;
            System.out.println("A tv da marca "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("ligue a tv");
        }
    }
}
