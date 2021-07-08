package rusha.x;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        List<String> chet = new ArrayList<>();
        List<String> nechet = new ArrayList<>();

        for (int i = 0; i < n; i += 1){
            int a = scanner.nextInt();
            if (a % 2 == 1) {
                nechet.add(String.valueOf(a));
            } else {
                chet.add(String.valueOf(a));
            }
        }
        out.println(String.join(" ", nechet));
        out.println(String.join(" ", chet));

        if (chet.size() >= nechet.size()) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.flush();
    }
}
