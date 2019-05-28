package melinda;

public class NumberAnalyzerDemo {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};

// Create an Analyzer object.
        NumberAnalyzer<Integer> analyzer = new NumberAnalyzer<>(numbers);

// Display the highest value in the array.
        System.out.println("The highest value is " +
                analyzer.getHighest(numbers));

// Display the lowest value in the array.
        System.out.println("The lowest value is " +
                analyzer.getLowest(numbers));

// Display the total of the values in the array.
        System.out.println("The total of the values is " +
                analyzer.getTotal(numbers));

//// Display the average of the values in the array.
        System.out.println("The average of the values is " +
                analyzer.getAverage(numbers));


    }
}
