public class Driver {
    private static int callCount = 0;

    public static void main(String[] args) {
        Integer[] data = {2, 43, 12, 44, 22, 77, 25, 11, 22, 33, 11, 656, 2143, 21};
        quickSort(data);
        for (int v : data) {
            System.out.printf("%d ", v);
        }
        System.out.println();
//        System.out.println(data.length);
//        System.out.println(callCount);
    }

    public static <T extends Comparable<T>> void quickSort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }


    // O(n*log(n))
    private static <T extends Comparable<T>> void quickSort(T[] data, int start, int end) {
        if (start >= end) return;
        int pivot = partition(data, start, end);
        quickSort(data, start, pivot - 1);
        quickSort(data, pivot + 1, end);
    }

    private static <T extends Comparable<T>> int partition(T[] data, int start, int end) {
        int middle = (start + end) / 2;
        T pivotValue = data[middle];
        data[middle] = data[start];
        data[start] = pivotValue;
        int pivotIndex = start;
        for (int i = start; i <= end; i++) {
            if (data[i].compareTo(pivotValue) < 0) {
                pivotIndex ++;
                T temp = data[i];
                data[i] = data[pivotIndex];
                data[pivotIndex] = temp;
            }
        }
        data[start] = data[pivotIndex];
        data[pivotIndex] = pivotValue;
        return pivotIndex;
    }
    // partition
    // 5, 12, 19, 1, 55, 22, 8
    // 1. set pivotValue = middle value
    // 2. swap pivot value with the first value in partition
    // 3. set the pivotIndex to first index in partition
    // 4. scan the array
    //     if value at i is < pivot value
//            increment pivotIndex
//            swap value at i with data[pivotIndex]
    // 5. swap pivotValue (at the start of partition) to the pivot index
    // 6. return pivotIndex



}
