

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 15;
        naruto.aldeia = "Konoha";
        naruto.patente = "Jonin";

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Konoha";
        sasuke.idade = 16;
        sasuke.patente = "Chunin";

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Konoha";
        hinata.idade = 16;
        hinata.patente = "Chunin";

        System.out.println(hinata.byakugan());

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki";
        boruto.aldeia = "Konoha";
        boruto.idade = 8;
        boruto.patente = "Genin";

        boruto.ativar_jougan();

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
