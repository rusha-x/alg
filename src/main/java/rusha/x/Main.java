package rusha.x;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        List<TopCoder> input = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            int ni = scanner.nextInt();
            for (int w = 0; w < ni; w += 1) {
                TopCoder a = new TopCoder(scanner.nextDouble(), scanner.next());
                input.add(a);
            }
        }
        input.sort(Collections.reverseOrder());
        out.println(input.size());
        for (TopCoder topCoder : input) {
            out.println(topCoder);
        }
        out.flush();
    }
    public static class TopCoder implements Comparable<TopCoder> {
        public Double score;
        public String name;

        public TopCoder(Double score, String name) {
            this.score = score;
            this.name = name;
        }

        @Override
        public String toString() { return "" + String.format("%.2f", score) + " " + name; }

        @Override
        public int compareTo(TopCoder o) {
            return score.compareTo(o.score);
        }
    }
}
