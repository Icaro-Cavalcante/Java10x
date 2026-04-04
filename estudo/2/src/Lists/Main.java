package Lists;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Nagato Uzumaki");
        ninjasList.add("Naruto Uzumaki");
        ninjasList.remove("Naruto Uzumaki");
        System.out.println(ninjasList);
    }
}
