package Records;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Ninja naruto = new Ninja("Naruto Uzumaki", 18, "narutouzumaki@konoha.com");
        System.out.println(naruto);

        NinjaRecord sasuke = new NinjaRecord("Sasuke Uchiha", 18, "sasukesharigan@uchiha.com");
        System.out.println(sasuke.nome());
    }
}