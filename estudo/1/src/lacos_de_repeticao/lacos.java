package lacos_de_repeticao;

public class lacos {
    public static void main(String args[]) {
        /*
        * Lacos de repetição: vão repetir um bloco de código enquanto uma condição for verdadeira
        * while
        * for
         */
        int limite = 10;
        int clones = 0;
        while (clones < limite) {
            clones++;
            System.out.println("O naruto fez "+ clones + " clones.");
        }
        System.out.println("\n");
        int tamanho = 4;
        String[] array = new String[]{"Naruto", "Sasuke", "Sakura", "Kakashi"};
        for (int i = 0; i < tamanho; i++) {
            System.out.println(array[i]);
        }
    }
}
