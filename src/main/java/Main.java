import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> items = new HashMap<>();
        items.put(101, "Sword");
        items.put(102, "Axe");
        items.put(103, "Shield");

        items.put(102, "Legendary Axe");
        items.remove(103);

        for (Map.Entry<Integer, String> entry : items.entrySet()) {
            if (entry.getKey() == 101) {
                System.out.println("Key 101 = " + items.containsKey(101));

            }
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }


    }
}
