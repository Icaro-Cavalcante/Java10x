package Estrutura_de_dados;

public class arrays {
    public static void main(String[] args) {
        // String[] array = {"Naruto", "Sasuke", "Sakura", "Kakashi", "Haku", "Zabusa"};
        int tamanho = 6;
        String[] array = new String[tamanho];
        array[0] = "naruto";
        array[1] = "sasuke";
        array[2] = "sakura";
        array[3] = "kakashi";
        array[4] = "haku";
        array[5] = "zabusa";


        for (int i = 0; i < tamanho; i++) {
            System.out.println(array[i]);
        }
    }
}
