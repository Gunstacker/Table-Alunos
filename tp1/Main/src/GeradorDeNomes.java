import java.util.Random;

public class GeradorDeNomes {
    private static final String[] nomes = {"João", "Maria", "Pedro", "Ana", "Luiza", "Carlos", "Renata", "Felipe"};

    public static String gerarNomeAleatorio() {
        Random random = new Random();
        int index = random.nextInt(nomes.length);
        return nomes[index];
    }

    public static void main(String[] args) {
        String nomeAleatorio = gerarNomeAleatorio();
        System.out.println("Nome gerado aleatoriamente: " + nomeAleatorio);
    }
}
