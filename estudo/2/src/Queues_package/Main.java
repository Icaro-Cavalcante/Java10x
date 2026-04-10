package Queues_package;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Naruto");
        fila.add("Sasuke");

        fila.poll();
        System.out.println(fila);

        if (fila.isEmpty()) {
            System.out.println("\nA fila está vazia.");
        }
        else {
            System.out.println("\nA fila não está vazia");
        }

    }
}
