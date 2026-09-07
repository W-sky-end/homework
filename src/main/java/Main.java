import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int health = 75;
        int damage = 25;

        System.out.println("Choose 1 or 2,3 for attack");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                health -= damage;
                break;
            case 2:
                health -= damage * 2;
                break;
            case 3:
                health -= damage * 3;
        }
        if (health > 50) {
            System.out.println("You are full!");
        } else if (health <= 50 && health > 0) {
            System.out.println("You are not full!");
        } else {
            System.out.println("You are dead");
        }
        sc.close();

        int monsterHealth = 100;
        int playerDmg = 20;

        for (int i = 0; monsterHealth > 0; i++) {
            monsterHealth -= playerDmg;
            System.out.println(i + ")" + monsterHealth + " - Monster's Health");
            if (monsterHealth <= 0) {
                monsterHealth = 0;
                System.out.println("monster is dead");
                break;
            }
        }
    }
}
