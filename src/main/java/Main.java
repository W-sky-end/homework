import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mHp = 100;
        int pHp = 100;
        int attack = 10;
        int choose;

        while (pHp > 0 && mHp > 0) {
            do {
                System.out.println("Choose 1 or 2 for attack");
                choose = sc.nextInt();
            } while (choose < 1 || choose > 2);
            switch (choose) {
                case 1:
                    mHp = calculateHealth(mHp, attack, 1);
                    isAlive(mHp);
                    System.out.println("Monster's health is " + mHp + "\nPlayer attacked monster on " + attack + " health");
                    break;
                case 2:
                    mHp = calculateHealth(mHp, attack, 2);
                    isAlive(mHp);
                    System.out.println("Monster's health is " + mHp + "\nPlayer attacked monster on " + (attack * 2) + " health");
                    break;
                default:
                    System.out.println("Invalid choice");
            }


        }
        int[] hp = {100, 75, 50, 25};
        hp[1] = 65;

        int maxHp = hp[0];
        int minHp = hp[0];
        int sumHp = 0;

        for (int i = 0; i < hp.length; i++) {
            if (hp[i] > maxHp) {
                maxHp = hp[i];
            }
            if (hp[i] < minHp) {
                minHp = hp[i];
            }
            sumHp += hp[i];
        }
        System.out.println("Max HP: " + maxHp);
        System.out.println("Min HP: " + minHp);
        System.out.println("Sum: " + sumHp);

        List<String> inventory = new ArrayList<>();
        inventory.add("Sword");
        inventory.add("Axe");
        inventory.add("Shield");
        System.out.println(inventory.get(1));
        inventory.remove(1);
        System.out.println(inventory.get(1));
        System.out.println(inventory);
        inventory.set(1, "Bow");
        System.out.println(inventory.get(1));
        System.out.println(inventory.size());

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }
        for(String item: inventory){
            if(item.equals("Sword")){
                System.out.println("Sword find" + item);


        }
            for (int i = 0; i < inventory.size(); i++) {
                if(inventory.get(i).equals("Sword")){
                    System.out.println("Sword find :" + item + "\nPlace : " + inventory.indexOf(i));
                }
            }

            }
        List<String> inventory2 = new ArrayList<>();

        inventory2.add("Sword");
        inventory2.add("Shield");
        inventory2.add("Potion");

        boolean sword = inventory2.contains("Sword");
        inventory2.add(1,"Axe");
        System.out.println(inventory2);
        boolean empty = inventory2.isEmpty();
        inventory2.clear();
        boolean empty2 = inventory2.isEmpty();

    }



    static int calculateDamage(int attack, int multiplayer) {
        return attack * multiplayer;
    }

    static int calculateHealth(int pHp, int attack, int multiplayer) {
        return pHp - calculateDamage(attack, multiplayer);
    }

    static boolean isAlive(int pHp) {
        return pHp > 0;
    }
    static void showInfo(int hp) {
        if (hp > 0) {
            System.out.println("HP: " + hp + "\nAlive");
        } else {
            System.out.println("HP: " + hp + "\nDead");
        }
    }
    static String getStatus ( int hp) {
        return isAlive(hp) ? "Alive" : "Dead";
    }
}


