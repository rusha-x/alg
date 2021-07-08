package rusha.x;

import java.util.Scanner;

public class Spiral {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer m = scanner.nextInt();
        int[][] matrix = new int[m][];
        for (int i = 0; i < m; i++) {
            matrix[i] = new int[m];
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        Direction direction = Direction.UP;

        int i = m / 2;
        int j = m / 2;
        int step = 1;
        step:
        while (true) {
            for (int a = 0; a < step; a++) {
                if (!(0 <= i && i < m && 0 <= j && j < m)) {
                    break step;
                }
                System.out.println(matrix[i][j]);
                switch (direction) {
                    case UP:
                        i -= 1;
                        break;
                    case RIGHT:
                        j += 1;
                        break;
                    case DOWN:
                        i += 1;
                        break;
                    case LEFT:
                        j -= 1;
                        break;
                }
            }
            switch (direction){

                case UP:
                    direction = Direction.RIGHT;
                    break;
                case RIGHT:
                    direction = Direction.DOWN;
                    step += 1;
                    break;
                case DOWN:
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    direction = Direction.UP;
                    step += 1;
                    break;
            }
        }

    }

    enum Direction {
        UP, RIGHT, DOWN, LEFT;
    }
}