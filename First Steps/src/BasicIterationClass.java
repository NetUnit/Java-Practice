import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicIterationClass {
    /**
     * represents several methods of iteration different (1)
     * types of data
     * @param String[] -  sequence or string of connected characters
     * <p>
     * IterateString - iterates through string var (2)
     * @param  str - string data to be iterated
     * !! charAt(i) - gets value related to this index
     * IterateRange - iterates through a range of ints (3)
     * @param  digits - sequence of ints to be iterated
     * IterateArrayOnlyEven - iterate through evens only (4)
     * IterateSequenceOfInts - iterate through a sequence
     * <p>
     * loop for:
     * int i=0 - defines int index of iteration start (4)
     * i < str.length() - defines the loop condition (5)
     * if True next loop round, if False break the loop
     * i++ - increases a value each time
     */
    static void IterateString(String str) {
        for (int i=0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    static void IterateRange(String[] args) {
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    static void IterateArrayOnlyEven(String[] args) {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(String.format("Even: %d", i));
        }
    }

    static void IterateSequenceOfInts(int... digits) {
        for (int i = 0; i < digits.length; i = i + 1) {
            System.out.println(String.format("This is int#%d: %d", i + 1, digits[i]));
        }
    }

    static void ForEachIteration() {
        List<Integer> Integer_list = IntStream.range(40, 50).boxed().collect(Collectors.toList());
        for (Integer digit: Integer_list ) {
            System.out.println(digit);
        }
    }

    static void JavaInfiniteLoop() {
        String [] some_arr = {"3", "7", "10", "13"};
        for (int i = some_arr.length - 1; i >= 0; i--) {
            System.out.println(some_arr[i]);
        }
    }

    public static void main (String[] args) {
        // IterateString("Test|String");
        // IterateRange(args);
        // IterateArrayOnlyEven(args);
        // IterateSequenceOfInts(2, 4, 6, 9);
        // ForEachIteration();
        JavaInfiniteLoop();

    }
}
