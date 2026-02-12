package condicionais;

public class ifelse {
    public static void main(String[] args) {
        // Ninja Kakashi
        String nome1 = "Kakashi";
        int idade1 = 29;
        boolean hokage = false;
        String patente = "";
        short missoes_concluidas = 60;

        /*
        * Condicionais seguem a mesma lógica de c ```if (condicao) {codigo}```
        * || --> OR
        * && --> AND
        * Else if - Outro caso
        * Else - Se nenhum caso for real
        */
        if (missoes_concluidas >= 5 & missoes_concluidas < 20) {
            patente = "Genin";
        }
        else if (missoes_concluidas >= 20 & missoes_concluidas < 50) {
            patente = "Chunin";
        }
        else if (missoes_concluidas >= 50) {
            patente = "Jounin";
        }
        else {
            patente = "Não é um ninja";
        }
        System.out.println(patente);

    }
}
