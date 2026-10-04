import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<String> inventory = new HashSet<String>();
        inventory.add("Sword");
        inventory.add("Axe");
        inventory.add("Shield");
        inventory.add("Sword");

        System.out.println(inventory);
        System.out.println(inventory.size());
        System.out.println(inventory.contains("Sword"));
        System.out.println(inventory.contains("Axe"));
        inventory.remove("Axe");
        System.out.println(inventory);
        System.out.println(inventory.size());

        inventory.add("Sword");
        inventory.add("Sword");
        inventory.add("Sword");

        
    }
}
