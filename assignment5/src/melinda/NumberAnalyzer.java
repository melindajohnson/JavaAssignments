package melinda;

public class NumberAnalyzer<T extends Number> {
    private T[] array;

    public NumberAnalyzer(T[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            array[i] = arr[i];
//        }
        array = arr;
    }

    public NumberAnalyzer() {
//        for (int i = 0; i < arr.length; i++) {
//            array[i] = arr[i];
//        }
        array = null;
    }

    T get(int i) {
        return array[i];
    }

    void set(int i, T value) {
        array[i] = value;
    }


    public <T extends Comparable<T>> T getHighest(T[] arr) {
        T highest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(highest) == 1) {
                highest = arr[i];
            }
        }
        return highest;
    }

    public <T extends Comparable<T>> T getLowest(T[] arr) {
        T lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(lowest) == -1) {
                lowest = arr[i];
            }
        }
        return lowest;
    }

    public double getTotal(T[] arr) {
        double result = 0.0;
        for (Number element : arr) {
            result += element.doubleValue();
        }
        return result;
    }

    public double getAverage(T[] arr) {
        double result = 0.0;
        for (Number element : arr) {
            result += element.doubleValue();
        }
        return result / arr.length;
    }

}
