package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas_list = new ArrayList<>();
        Set<String> ninjas_set = new TreeSet<>();
        Set<Integer> numeros_hash = new HashSet<>();
        Set<Integer> numeros_tree = new TreeSet<>();

        ninjas_list.add("Naruto");
        ninjas_list.add("Sasuke");
        ninjas_list.add("Naruto");
        ninjas_list.add("Sasuke");
        ninjas_list.add("Boruto");
        ninjas_set.addAll(ninjas_list);

        numeros_hash.add(7);
        numeros_hash.add(78);
        numeros_hash.add(7854);
        numeros_hash.add(12);
        numeros_hash.add(4);
        numeros_hash.add(57);
        numeros_tree.addAll(numeros_hash);

        System.out.println(ninjas_list);
        System.out.println("\n");
        System.out.println(ninjas_set);

        System.out.println("\nNúmeros: " + numeros_hash);
        System.out.println("\nNúmeros: " + numeros_tree);

    }
}
