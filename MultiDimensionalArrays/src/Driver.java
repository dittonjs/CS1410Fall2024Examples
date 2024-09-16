public class Driver {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] nums2d = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[][][] nums3d = {
                {
                        {1,2,3},
                        {4,5,6}
                }, {
                        {7,8,9},
                        {10,11,12}
                }
        };

        int[][] raggedNums = {
                {1},
                {1,2,3},
                {},
                {1,2,3,4,65,6,7,8,5,4,5,6}
        };

        System.out.println(nums2d[1][2]);
        System.out.println(nums3d[0][1][2]);

        String[][] strings = new String[3][10];
        System.out.println(strings[0]);
        System.out.println("========================");
        int[][] data = genNums(40);
        display2dArray(data);
    }

    public static void display2dArray(int[][] array) {
        for(int[] inner: array) {
            for (int data : inner) {
                System.out.printf("%d, ", data);
            }
            System.out.println();
        }
    }

    public static int[][] genNums(int rows, int cols) {
        int[][] array = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j ++) {
                array[i][j] = (int)(Math.random() * 10000);
            }
        }
        return array;
    }

    public static int[][] genNums(int rows) {
        int[][] array = new int[rows][];
        for(int i = 0; i < rows; i++) {
            int cols = (int)(Math.random() * 15) + 1;
            array[i] = new int[cols];
            for (int j = 0; j < cols; j ++) {
                array[i][j] = (int)(Math.random() * 10000);
            }
        }
        return array;
    }
}
