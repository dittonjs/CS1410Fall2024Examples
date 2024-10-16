public class Driver {
    public static void main(String[] args) {
        printDownToZero(10);
        System.out.println("========================");
        printToNum(-2);
        int[] data = {12, 3, 5, 6, 4, 12, 15};
        System.out.println();
        System.out.println(computeSum(data));

        System.out.println(fib(30));
        System.out.println(linearSearch(data, 1));
        int[] sortedData = {1, 2, 45, 67, 89, 345, 6578};
        System.out.println(binarySearch(sortedData, 234));
    }
    // stacl
    // pdt0 1

    public static void printDownToZero(int num) {
        // base case
        System.out.println(num);

        if (num <= 0) {
            return;
        }
        printDownToZero(num - 1);
        // recursive step
    }
    public static void printToNum(int finalNum) {
        printToNum(finalNum, 1);
    }

    private static void printToNum(int finalNum, int currentNum) {
        System.out.println(currentNum);
        if (currentNum >= finalNum) {
            return;
        }

        printToNum(finalNum, currentNum + 1);
    }

//    public static int computeSum(int[] nums) {
//        return computeSum(nums, 0, 0);
//    }

//    private static int computeSum(int[] nums, int sum, int position) {
//        if (position >= nums.length) return sum;
//
//        return computeSum(nums, sum + nums[position], position + 1);
//    }

    public static int computeSum(int[] nums) {
        return computeSum(nums, 0);
    }

    private static int computeSum(int[] nums, int position) {
        if (position >= nums.length) return 0;
        return nums[position] + computeSum(nums, position+1);
    }

//    public static double fib(int num) {
//        if (num == 1 || num == 2) return 1;
//
//        return fib(num - 1) + fib(num - 2);
//    }
    // fib(7) = fib(6)        +    fib(5)
    //     fib(5) + fib(4)     fib(4)
    public static double fib(int num) {
        return fib(num, 0, 1, 1);
    }
    private static double fib(int num, int numComputed, int fib1, int fib2) {
        if (num == 1) return 1;
        if (num == 2) return 1;
        if (numComputed == num - 3) return fib1 + fib2;
        return fib(num, numComputed + 1, fib1 + fib2, fib1);
    }


    // steps: check at position then search rest of array
//    public static boolean linearSearch(int[] data, int search) {
//        return linearSearch(data, search, 0);
//    }
//
//    private static boolean linearSearch(int[] data, int search, int position) {
//        if(position >= data.length) return false;
//        if (data[position] == search) return true;
//
//        // add one to position
//        return linearSearch(data, search, position+1);
//    }

    // search = [1,2,3,4,5,6]
    // search [1,2,4] OR search [4,5,6]
    // search [1] OR [2, 4]
                     //[2, 4]

    public static boolean linearSearch(int[]data, int search) {
        return linearSearch(data, search, 0, data.length -1);
    }

    private static boolean linearSearch(int[] data, int search, int start, int end) {
        if(start > end) return false;
        int middle = (start + end) / 2;
        if (data[middle] == search) return true;
        return linearSearch(data, search, start, middle-1)
                || linearSearch(data, search, middle + 1, end);
    }

    public static boolean binarySearch(int[] data, int search) {
        return binarySearch(data, search, 0, data.length -1);
    }

    private static boolean binarySearch(int[] data, int search, int start, int end) {
        if(start > end) return false;
        int middle = (start + end) / 2;
        if (data[middle] == search) return true;
        if (search < data[middle]) return binarySearch(data, search, start, middle - 1);
        else return binarySearch(data, search, middle + 1, end);
    }

}
