import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerHealth = 100;
        int monsterHealth = 120;
        int playerDamage = 25;
        int monsterDamage = 15;
        int choose;
        while (monsterHealth > 0 && playerHealth > 0) {
            do {
                System.out.println("Your choose 1-3 for attack?");
                choose = sc.nextInt();
            } while (choose < 1 || choose > 3);
            switch (choose) {
                case 1:
                    monsterHealth -= playerDamage;
                    System.out.println("Monster Health: " + monsterHealth);
                    playerHealth -= monsterDamage;
                    System.out.println("Player Health: " + playerHealth);
                    break;
                case 2:
                    monsterHealth -= playerDamage * 2;
                    System.out.println("Monster Health: " + monsterHealth);
                    playerHealth -= monsterDamage;
                    System.out.println("Player Health: " + playerHealth);
                    break;
                case 3:
                    monsterHealth -= playerDamage * 3;
                    System.out.println("Monster Health: " + monsterHealth);
                    playerHealth -= monsterDamage;
                    System.out.println("Player Health: " + playerHealth);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

            if (monsterHealth <= 0) {
                monsterHealth = 0;
                System.out.println("Monster is dead");
            }
            if (playerHealth <= 0) {
                playerHealth = 0;
                System.out.println("Player is dead");
            }
        }
    }
}

