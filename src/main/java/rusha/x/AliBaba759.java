package rusha.x;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AliBaba759 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> input = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            int a = scanner.nextInt();
            input.add(a);
        }
        input.sort(Collections.reverseOrder());
        int max = 0;
        for(int y = 0; y < m; y += 1){
            int b = input.get(y);
            if (b > 0) {
                max += b;
            }
        }
        out.println(max);
        out.flush();
    }
}
