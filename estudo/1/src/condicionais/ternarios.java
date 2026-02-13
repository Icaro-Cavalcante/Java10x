package condicionais;
import java.util.Scanner;

public class ternarios {
    public static void main(String[] args) {
        /*
        * Ternários São maneiras de reduzir o código
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
         */

        Scanner input = new Scanner(System.in);
        short missoes = input.nextShort();
        String patente = (missoes >= 15) ? "Chunin" : "Genin";
        System.out.println(patente);
    }
}
