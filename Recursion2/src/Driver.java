public class Driver {
    private static char[][] map1 = {
            {'1', '5', '5', '5','5',},
            {'1', '5', '5', '5','5',},
            {'1', '1', '1', '5','5',},
            {'5', '5', '1', '5','5',},
            {'5', '5', '1', '1','f',},
    };

    private static char[][] map2 = {
            {'1', '1', '1', '1','1',},
            {'2', '5', '5', '5','1',},
            {'2', '1', '1', '1','1',},
            {'2', '1', '5', '5','5',},
            {'f', '1', '5', '5','5',},
    };

    private static char[][] map3 = {
            {' ', '*', '*', '*','*',},
            {' ', ' ', ' ', ' ',' ',},
            {' ', ' ', '*', '*','f',},
            {'*', ' ', ' ', ' ',' ',},
            {' ', ' ', '*', ' ','*',},
    };


    public static void main(String[] args) {
        solveMaze(map3, 0,0, 0);
        printMap(map3);
    }

    public static void printMap(char[][] map) {
        for (char[] row : map) {
            for (char c: row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static boolean solveMaze(char[][] maze, int row, int col, int steps) {
        if(
            row < 0 ||
            row > maze.length - 1 ||
            col < 0 ||
            col>maze[row].length - 1
        ) return false;

        if (maze[row][col] == 'f') {
            maze[row][col] = 'x';
            return true;
        }

        if (maze[row][col] == '*') return false;
        if (maze[row][col] == 'x') {
            return false;
        }
        maze[row][col] = 'x';

        boolean top = solveMaze(maze, row - 1, col, steps + 1);
        boolean bottom = solveMaze(maze, row + 1, col, steps + 1);
        boolean right = solveMaze(maze, row, col + 1, steps + 1);
        boolean left = solveMaze(maze, row , col - 1, steps + 1);
        if (
                (top || bottom || right || left)
        ) {
            return true;
        } else {
            maze[row][col] = ' ';
            return false;
        }

    }


}
