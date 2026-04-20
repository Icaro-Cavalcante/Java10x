package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas_list = new ArrayList<>();
        Set<String> ninjas_set = new HashSet<>();
        ninjas_list.add("Naruto");
        ninjas_list.add("Sasuke");
        ninjas_list.add("Naruto");
        ninjas_list.add("Sasuke");
        ninjas_set.addAll(ninjas_list);

        System.out.println(ninjas_list);
        System.out.println("\n");
        System.out.println(ninjas_set);

    }
}
