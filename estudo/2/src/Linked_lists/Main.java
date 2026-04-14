package Linked_lists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Naruto");
        lista.add("Nagato");
        lista.add("Sakura");
        lista.remove("Nagato");
        System.out.println(lista);
    }
}
