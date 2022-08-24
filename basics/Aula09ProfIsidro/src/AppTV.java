public class AppTV {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.canal = 7;
        tv.ligada = false;
        tv.marca = "Samsung";
        tv.preco = 3000.00;
        tv.tamanho = 29.5;
        tv.volume = 56;

        tv.ligar();
        tv.aumentarVolume();
        tv.avancarCanal();
    }
}