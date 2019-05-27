package PeriodicTable;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();


        while (number-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i++) {
                String element = input[i];
                if (!elements.contains(element)) {
                    elements.add(element);
                }
            }

        }

        System.out.println(elements.toString()
                .replaceAll("\\[|,|\\]", ""));

    }
}
