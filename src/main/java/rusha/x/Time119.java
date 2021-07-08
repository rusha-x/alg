package rusha.x;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Time119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        List<TimeStamp> input = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            TimeStamp a = new TimeStamp(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            input.add(a);
        }
        Collections.sort(input);
        for (TimeStamp timeStamp : input) {
            out.println(timeStamp);
        }
        out.flush();
    }

    static class TimeStamp implements Comparable<TimeStamp> {
        int hours;
        int minutes;
        int second;

        public TimeStamp(int hours, int minutes, int second) {
            this.hours = hours;
            this.minutes = minutes;
            this.second = second;
        }

        @Override
        public int compareTo(TimeStamp other) {
            if (this.hours > other.hours) {
                return 1;
            } else if (this.hours < other.hours) {
                return -1;
            } else {
                if (this.minutes > other.minutes) {
                    return 1;
                } else if (this.minutes < other.minutes) {
                    return -1;
                } else {
                    if (this.second > other.second)
                        return 1;
                    else if (this.second < other.second) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }

        @Override
        public String toString() {
            return "" + hours + " " + minutes + " " + second + " ";
        }
    }
}
