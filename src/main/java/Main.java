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
}

