package rusha.x;

import java.util.Scanner;

public class Id {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] usedIdIndexes = new int[n];

        for (int i = 0; i < n - 2; i++) {
            int id = scanner.nextInt();
            usedIdIndexes[id - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (usedIdIndexes[i] == 0) {
                System.out.print(i + 1);
                System.out.print(" ");
            }
        }
    }
}
