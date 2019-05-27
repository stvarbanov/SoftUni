package SetOfElements;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();


        int l = n + m;

        int input;

        while (n-- > 0) {
            int number = scanner.nextInt();
            set1.add(number);
        }
        while (m-- > 0) {
            int number = scanner.nextInt();
            set2.add(number);
        }


        set1.retainAll(set2);

        System.out.println(set1.toString()
                .replaceAll("\\[|,|\\]", ""));

    }
}
