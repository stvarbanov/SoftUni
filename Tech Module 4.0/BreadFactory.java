import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energy = 100;
        int coins = 100;

        String[] input = scanner.nextLine().split("\\|");

        for (int i = 0; i < input.length; i++) {
            String[] data = input[i].split("-");
            String command = data[0];
            int value = Integer.parseInt(data[1]);

            if (command.equals("rest")) {
                if ((energy + value) > 100) {
                    value = 100 - energy;
                } else {
                    energy += value;
                }
                System.out.println
                        ("You gained " + value + " energy.");
                System.out.println("Current energy: " + energy + ".");
            } else if (command.equals("order")) {
                if (energy - 30 > 0) {
                    energy -= 30;
                    coins += value;
                    System.out.println
                            ("You earned " + value + " coins.");
                } else {
                    energy += 50;
                    System.out.println("You had to rest!");
                }
            } else {
                if (coins > value) {
                    coins -= value;
                    System.out.println(
                            "You bought " + command+ ".");
                } else if (coins >= 0) {
                    System.out.println( "Closed! Cannot afford " + command + ".");
                    return;
                }

            }


        }

        System.out.println("Day completed!");
        System.out.println("Coins: " + coins);
        System.out.println("Energy: " + energy);

    }


}

