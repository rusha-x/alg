package rusha.x;

import java.util.Scanner;

public class Dovod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = new StringBuffer(String.valueOf(Math.abs(a))).reverse().toString();
        if (a >= 0)
            System.out.println(Integer.valueOf(b));
        else
            System.out.println(Integer.parseInt(b) * -1);
    }
}

