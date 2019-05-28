package melinda;

import java.util.Random;

//Bubble sort 1674117 Milliseconds = 27 minutes and 54 seconds.
//Selection Sort 277572Milliseconds = 4 minutes and 37 seconds.
//Quick Sort 3266 Milliseconds = 0 minutes and 3 seconds.
public class EmpiricalStudy {

    public static void main(String[] args) {
        long timeStarted = System.currentTimeMillis();
        Random rand = new Random();
//        int[] array1 = new int[1000000];
//        int[] array2 = new int[1000000];
//        int[] array3 = new int[1000000];
//
//        for (int i = 0; i < array3.length; i++) {
//            array1[i] = rand.nextInt(100) + 1;
//            array2[i] = array1[i];
//            array3[i] = array1[i];
//
//        }
//        Sort.quickSort(array3);
//        long endtime = System.currentTimeMillis();
//        System.out.println("Sorting last for:");
//        long millisecond3 = (endtime - timeStarted);
//        System.out.format("Quick Sort %d Milliseconds = %d minutes and %d seconds.", millisecond3, (millisecond3 / 1000) / 60, (millisecond3 / 1000) % 60);
//        Sort.bubbleSort(array1);
//        System.out.println("Sorting last for:");
//        long millisecond1 = (System.currentTimeMillis() - timeStarted);
//        System.out.format("Bubble sort %d Milliseconds = %d minutes and %d seconds.", millisecond1, (millisecond1 / 1000) / 60, (millisecond1 / 1000) % 60);
//        Sort.selectionSort(array2);
//        System.out.println("Sorting last for:");
//        long millisecond2 = (System.currentTimeMillis() - timeStarted);
//        System.out.format("Selection Sort %dMilliseconds = %d minutes and %d seconds.", millisecond2, (millisecond2 / 1000) / 60, (millisecond2 / 1000) % 60);

        int[] array4 = new int[100000000];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = rand.nextInt(100) + 1;

 // my change
        }
        Sort.quickSort(array4);
        System.out.println("Sorting last for:");
        long millisecond4 = (System.currentTimeMillis() - timeStarted);
        System.out.format("Quick Sort %d Milliseconds = %d minutes and %d seconds.", millisecond4, (millisecond4 / 1000) / 60, (millisecond4 / 1000) % 60);
    }
}