import java.util.Random;

public class GeradorDeNumeros {
    public static String gerarNumeroAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(9999) + 1;
        return String.format("%04d", numero);
    }

}