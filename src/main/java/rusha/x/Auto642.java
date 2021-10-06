package rusha.x;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Auto642 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        List<Integer> price = new ArrayList<>();

        for (int i = 0; i <= n - 1; i += 1) {
            price.add(scanner.nextInt());
        }
        Collections.sort(price);
        int count = 0;
        for (int u = 0; u < n; u += 1){
            int y = price.get(u);
            if (y <= a) {
                a -= u;
                count += 1;
            }

        }
        writer.println(count);
        writer.flush();
    }
}
