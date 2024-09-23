public class Game {
    public static void main(String[] args) {
        int worldWidth = 15;
        int worldHeight = 15;
        char[][] world = generateRandomWorld(worldWidth, worldHeight);
        displayWorld(world);
    }

    public static void displayWorld(char[][] world) {
        for(char[] row : world) {
            for (char obj: row) {
                System.out.printf("%3s", obj);
            }
            System.out.println();
        }
    }

    public static char[][] generateRandomWorld(int width, int height) {
        char[][] world = new char[height][width];
        for (int row = 0; row < height; row ++) {
            for (int col = 0; col < width; col ++) {
                double num = Math.random();
                if (num < .4) {
                    world[row][col] = '*';
                } else {
                    world[row][col] = ' ';
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            world = fineTuneWorld(world);
        }

        return world;
    }

    public static char[][] fineTuneWorld(char[][] world) {
        char[][] copy = copyWorld(world);
        for (int row = 0; row < world.length; row ++) {
            for (int col = 0; col < world[0].length; col ++) {
                int count = 0;
                if (col > 0 && row > 0 && world[row - 1][col - 1] == '*') count ++;
                if (row > 0 && world[row - 1][col] == '*') count ++;
                if (row > 0 && col + 1 < world[row].length && world[row-1][col + 1] == '*') count ++;
                if (col > 0 && world[row][col - 1] == '*') count ++;
                if (col + 1 < world[row].length  && world[row][col + 1] == '*') count ++;
                if (row + 1 < world.length && col > 0 && world[row + 1][col - 1] == '*') count ++;
                if (row + 1 < world.length && world[row + 1][col] == '*') count ++;
                if (row + 1 < world.length && col + 1 < world[row].length && world[row + 1][col + 1] == '*') count ++;
                if (row == 0) count ++;
                if (col == 0) count ++;
                if (row == world.length - 1) count++;
                if (col == world[row].length - 1) count ++;
                if (world[row][col] == '*' && count < 3) {
                    copy[row][col] = ' ';
                } else if (world[row][col] == ' ' && count > 4) {
                    copy[row][col] = '*';
                } else {
                    copy[row][col] = world[row][col];
                }
            }
        }
        return copy;
    }

    public static char[][] copyWorld(char[][] world) {
        char[][] copy = new char[world.length][world[0].length];
        System.arraycopy(world, 0, copy, 0, world.length);
        return copy;
    }

}
