package Estrutura_de_dados;

public class matriz {
    public static void main(String[] args) {
        String[][] matriz = new String[3][4];

        matriz[0][0] = "====Time 7====";
        matriz[0][1] = "Naruto";
        matriz[0][2] = "Sasuke";
        matriz[0][3] = "Sakura";

        matriz[1][0] = "====Time 10====";
        matriz[1][1] = "Chouji";
        matriz[1][2] = "Ino";
        matriz[1][3] = "Shikamaru";

        matriz[2][0] = "====Time 3====";
        matriz[2][1] = "Neji";
        matriz[2][2] = "Rock Lee";
        matriz[2][3] = "Tenten";

        for(int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
