package Phonebook;

import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";

        TreeMap<String, String> list = new TreeMap<>();

        while (!"search".equals(input = scanner.nextLine())) {
            String[] inputLine = input.split("-");
            String name = inputLine[0];
            String number = inputLine[1];

            if (!list.containsKey(name)) {
                list.put(name, number);
            } else if (list.containsKey(name)) {
                list.remove(name);
                list.put(name, number);
            }
        }

        while (!("stop").equals(input = scanner.nextLine())) {

            if (list.containsKey(input)) {
                System.out.println(input + " -> " + list.get(input));
            } else {
                System.out.println("Contact "+ input +" does not exist.");
            }


        }


    }
}
