import java.util.Random;

public class GeradorDeIdade {
    public static int gerarIdadeAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(35) + 1;
        return numero;
    }

}