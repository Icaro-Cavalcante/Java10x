package lacos_de_repeticao;

public class matriz {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int maior = matriz[0][0];
        int atual;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                atual = matriz[i][j];
                maior = (atual> maior) ? atual : maior;
            }
        }
        System.out.println(maior);
    }
}
