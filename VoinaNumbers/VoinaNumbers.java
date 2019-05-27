package VoinaNumbers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class VoinaNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());


        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty())
                break;

            Iterator<Integer> firstPlayerIterator = firstPlayer.iterator();
            Iterator<Integer> secondPlayerIterator = secondPlayer.iterator();

            int firstPlayerValue = firstPlayerIterator.next();
            firstPlayer.remove(firstPlayerIterator);

            int secondPlayerValue = firstPlayerIterator.next();
            secondPlayer.remove(secondPlayerIterator);

            if (firstPlayerValue > secondPlayerValue) {
                firstPlayer.add(firstPlayerValue);
                firstPlayer.add(secondPlayerValue);
            } else if (firstPlayerValue < secondPlayerValue) {
                secondPlayer.add(firstPlayerValue);
                secondPlayer.add(secondPlayerValue);

            } else {
                firstPlayer.add(firstPlayerValue);
                secondPlayer.add(secondPlayerValue);
            }
        }

        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");

        } else if (firstPlayer.size() < secondPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }


    }


}
