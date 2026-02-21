

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
    }
}
