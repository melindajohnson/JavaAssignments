package melinda;

import java.util.Random;

public class DateQuicksort {
    public static void main(String[] args) {
        System.out.println("Original array");
        System.out.println("-------");
        Date d1[] = new Date[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            d1[i] = new Date(rand.nextInt(12) + 1, rand.nextInt(31) + 1, 2018);
            System.out.println(d1[i].toString());
        }
        System.out.println();
        System.out.println("Sorted");
        System.out.println("-------");
        Date sortedArray[] = new Date[10];
        sortedArray = quickSort(d1);
        for (int i = 0; i < 10; i++) {
            System.out.println(d1[i].toString());
        }
    }



    public static <T extends Comparable<T>> T[] quickSort(T[] array) {
        doQuickSort(array, 0, array.length - 1);
        return array;
    }

    /**
     * The doQuickSort method uses the QuickSort algorithm
     * to sort an int array.
     *
     * @param array The array to sort.
     * @param start The starting subscript of the list to sort
     * @param end   The ending subscript of the list to sort
     */

    private static <T extends Comparable<T>> void doQuickSort(T[] array, int start, int end) {
        int pivotPoint;

        if (start < end) {
            // Get the pivot point.
            pivotPoint = partition(array, start, end);

            // Sort the first sub list.
            doQuickSort(array, start, pivotPoint - 1);

            // Sort the second sub list.
            doQuickSort(array, pivotPoint + 1, end);
        }
    }

    /**
     * The partiton method selects a pivot value in an array
     * and arranges the array into two sub lists. All the
     * values less than the pivot will be stored in the left
     * sub list and all the values greater than or equal to
     * the pivot will be stored in the right sub list.
     *
     * @param array The array to partition.
     * @param start The starting subscript of the area to partition.
     * @param end   The ending subscript of the area to partition.
     * @return The subscript of the pivot value.
     */

    private static <T extends Comparable<T>> int partition(T[] array, int start, int end) {
        T pivotValue;    // To hold the pivot value
        int endOfLeftList; // Last element in the left sub list.
        int mid;           // To hold the mid-point subscript

        // Find the subscript of the middle element.
        // This will be our pivot value.
        mid = (start + end) / 2;

        // Swap the middle element with the first element.
        // This moves the pivot value to the start of
        // the list.
        swap(array, start, mid);

        // Save the pivot value for comparisons.
        pivotValue = array[start];

        // For now, the end of the left sub list is
        // the first element.
        endOfLeftList = start;

        // Scan the entire list and move any values that
        // are less than the pivot value to the left
        // sub list.
        for (int scan = start + 1; scan <= end; scan++) {
            if (array[scan].compareTo(pivotValue) == -1) {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }

        // Move the pivot value to end of the
        // left sub list.
        swap(array, start, endOfLeftList);

        // Return the subscript of the pivot value.
        return endOfLeftList;
    }

    /**
     * The swap method swaps the contents of two elements
     * in an int array.
     *
     * @param array containing the two elements.
     * @param a     The subscript of the first element.
     * @param b     The subscript of the second element.
     */

    private static <T extends Comparable<T>> void swap(T[] array, int a, int b) {
        T temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

