import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TotalPoints {
    // solution1
    public static int points(String[] str_array) {
        int counter = 0;
        for (String value: str_array) {
            // split every count by colon pattern
            String[] inter_arr =  value.split(":");
            // assign counter conditions
            boolean draw = Integer.valueOf(inter_arr[0]) == Integer.valueOf(inter_arr[1]);
            boolean win = Integer.valueOf(inter_arr[0]) > Integer.valueOf(inter_arr[1]);
            if (draw) {
                counter += 1;
            }
            if (win) {
                counter += 3;
            }
        }
        return counter;
    }
    // solution 2 (2 methods)
    static int binary_result (String result) {
        String[] sublist = result.split(":");
        boolean win = Integer.valueOf(sublist[0]) - Integer.valueOf(sublist[1]) > 0;
        boolean draw =  Integer.valueOf(sublist[0]) - Integer.valueOf(sublist[1]) == 0;
        if (win) {
            return 3;
        }
        if (draw) {
            return 1;
        }
        return 0;
    }
    public static int points2(String[] str_array) {
        List<String> str_List = Arrays.asList(str_array);
        List<Integer> results = new ArrayList<>();
        str_List.forEach(string -> results.add(binary_result(string)));
        // method (1)
        // int total = results.stream().flatMapToInt(IntStream::of).sum();
        // method (2)
        int total = results.stream().mapToInt(Integer::intValue).sum();
        return total;
    }
    public static void main(String[] games) {
        int test1 = points(new String[] {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"});
        int test2 = points(new String[] {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"});
        int test3 = points(new String[] {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"});
        int test4 = points(new String[] {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"});
        int test5 = points(new String[] {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"});
        System.out.println(String.format("%d | %d | %d | %d | %d", test1, test2, test3, test4, test5));

        int test21 = points2(new String[] {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"});
        int test22 = points2(new String[] {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"});
        int test23 = points2(new String[] {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"});
        int test24 = points2(new String[] {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"});
        int test25 = points2(new String[] {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"});
        System.out.println(String.format("%d | %d | %d | %d | %d", test21, test22, test23, test24, test25));
    }
}
