public class Driver {
    public static void main(String[] args) {
        int[] nums = {1, 45, 23, 66, 35, 64, 98}; // 0x10ff
        int[] sortedNums = {1, 3, 5, 23, 56, 78, 90};
        System.out.println(linearSearch(nums, 100));
        selectionSort(nums);
        printArray(nums);
        System.out.println(binarySearch(sortedNums, 20));
        System.out.println(binarySearch(nums, 23));

//        int[] numsCopy = copy(nums);
//        System.out.println(nums == numsCopy);
//        nums = addItem(nums, 10); // 0x23ca
    }

    public static void printArray(int[] data) {
        for (int value: data) {
            System.out.println(value);
        }
    }

    public static int[] copy(int[] data) {
        int[] copy = new int[data.length];
        for(int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
        return copy;
    }

    public static int[] addItem(int[] data, int item) {
        int[] copy = new int[data.length + 1];
        for(int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
        copy[copy.length - 1] = item;
        return copy;
    }

    // O(n)
    public static boolean linearSearch(int[] data, int search) {
        for (int value: data) {
            if (value == search) return true;
        }
        return false;
    }

    // O(log_2(n))
    public static boolean binarySearch(int[] data, int search) {
        int start = 0;
        int end = data.length - 1;
        boolean found = false;
        while(!found && start <= end) {
            int middle = (start + end) / 2;
            if (data[middle] == search) {
                found = true;
            } else if (search > data[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return found;
    }


    public static void swap(int[] data, int i1, int i2) {
        int temp = data[i1];
        data[i1] = data[i2];
        data[i2] = temp;
    }

    //O(n^2)
    public static void bubbleSort(int[] data) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i+1]) {
                    swap(data, i, i+1);
                    swapped = true;
                }
            }
        } while(swapped);
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int smallestI = i;
            for (int j = i; j < data.length; j ++) {
                if (data[smallestI] > data[j]) {
                    smallestI = j;
                }
            }
            swap(data, i, smallestI);
        }
    }
}
