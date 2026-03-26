

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 15;
        naruto.aldeia = "Konoha";
        naruto.patente = Patente.JOUNIN;

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Konoha";
        sasuke.idade = 16;
        sasuke.patente = Patente.CHUNIN;

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Konoha";
        hinata.idade = 16;
        hinata.patente = Patente.CHUNIN;


        System.out.println(hinata.ataque_especial());

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki";
        boruto.aldeia = "Konoha";
        boruto.idade = 8;
        boruto.patente = Patente.GENIN;

        boruto.ativar_jougan();

        // Chamando o metodo
        sasuke.sharingan();
        System.out.println(naruto.ataque_especial());
        sasuke.ataque_especial();

        Hyuga neji = new Hyuga(Patente.CHUNIN, "Folha", 12, "Neji Hyuga");
        neji.estrategiaDeBatalhaNinja();

        Hatake kakashi = new Hatake(Patente.JOUNIN, "Konoha", 35, "Kakashi Hatake");
        kakashi.sharingan();

        Uchiha madara = new Uchiha(Patente.JOUNIN, "Konoha", 70, "Uchiha Madara", 100, "Susanoo Perfeito");

        Uchiha itachi = new Uchiha(Patente.JOUNIN, "Konoha", 35, "Itachi Uchiha", 200);

        Uchiha obito = new Uchiha(Patente.JOUNIN, "Konoha", 70, "Obito Uchiha", 100, "Kamui");

        obito.ativarMangekyou();


        itachi.ativarMangekyou("Amaterasu", "Tsukiyomi");

        kakashi.NinjaDeElite();
        

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
