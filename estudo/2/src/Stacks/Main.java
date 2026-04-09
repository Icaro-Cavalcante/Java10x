package Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> pilhaNinjas = new Stack<>();
        pilhaNinjas.push("Naruto Uzumaki");
        pilhaNinjas.push("Sasuke Uchiha");
        pilhaNinjas.push("Sakura Haruno");
        System.out.println("Lista completa: " + pilhaNinjas);

        pilhaNinjas.pop();

        System.out.println("\nO último a entrar foi o primeiro a sair: " + pilhaNinjas);

        System.out.println("\nO topo da pilha é " + pilhaNinjas.peek());

        System.out.println("\nO tamanho da pilha é " + pilhaNinjas.size());
    }
}
