import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int health = 95;
        int coins = 0;

        String[] rooms = scanner.nextLine().split("\\|");
        for (int i = 0; i < rooms.length; i++) {

            String[] roomData = rooms[i].split(" ");
            String token1 = roomData[0];
            int token2 = Integer.parseInt(roomData[1]);

            if (token1.equals("potion")) {
                if (health + token2 >= 100) {
                    int diff = 100 - health;
                    System.out.printf("You healed for %d hp.", diff);
                    System.out.printf("You healed for %d hp.", health);
                } else {
                    System.out.printf("You healed for %d hp.", token2);
                    System.out.printf("You healed for %d hp.", health);
                }

            } else if (token1.equals("chest")) {

            } else {
//some monster


            }


        }
//        out of for

    }
}
