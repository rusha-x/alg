package rusha.x;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String busyBrother = scanner.next();
        int length = 1;

        while (true) {
            char[] seq = busyBrother.substring(0, length).toCharArray();
            int seqIndex = 0;
            boolean isValid = true;
            for (char curr : busyBrother.toCharArray()) {
                if (curr != seq[seqIndex]) {
                    if (curr != '#') {
                        isValid = false;
                    }
                }
                if (seqIndex < length - 1)
                    seqIndex += 1;
                else
                    seqIndex = 0;
            }

            if (isValid) {
                System.out.print(length);
                return;
            }
            length += 1;
        }
    }
}