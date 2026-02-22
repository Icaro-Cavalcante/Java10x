

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 15;
        naruto.aldeia = "Konoha";
        naruto.patente = "Jonin";

        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Konoha";
        sasuke.idade = 16;
        sasuke.patente = "Chunin";

        System.out.println(sasuke.nome);

        // Chamando o metodo
        sasuke.sharingan();
        System.out.println(naruto.rasengan());

        // Calculando quanas missoes faltam para sasuke se tornar jonin
        int faltando = sasuke.ate_jonin(35);
        System.out.println(faltando);
        if (faltando <= 0) {
            System.out.println("Sasuke já é um jonin.");
        }
        else {
            System.out.println("Faltam " + faltando + " missões para sasuke se tornar jonin");
        }
    }
}
