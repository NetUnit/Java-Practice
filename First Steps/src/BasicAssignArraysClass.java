import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicAssignArraysClass {
    /**
     * <p>
     * https://www.softwaretestinghelp.com/java-list-how-to-create-initialize-use-list-in-java/
     */
    public static void main (String[] args) {
        /**
         * *** String[] ***
         */
        // 1
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        /**
         * *** int [] ***
         */
        // 1
        int[] int_list = {1, 2, 3, 4, 5};
        // System.out.println(int_list);

        /**
         * *** ArrayList ***
         */
        // 1 asList - from str values
        List<String> list2  = Arrays.asList(new String[] {"8", "10", "14", "20", "28" });
        // System.out.println(list2);
        // >> [8, 10, 14, 20, 28]
        // 1.1 asList - from Integer values
        List<Integer> list_int  = Arrays.asList(new Integer[] {8, 10, 14, 20, 28 });
        // System.out.println(list_int);
        // >> [8, 10, 14, 20, 28]
        // 1.1 asList - from Integer values
        ArrayList<Integer> arr_list = new ArrayList <Integer> (Arrays.asList(4, 7));
        // System.out.println(arr_list);
        // >> [4, 7]

        // 2 List.of()
        List<String> basket_w = List.of(new String[] {"potato", "beat", "carrot", "onion", "garlic"});
        // System.out.println(basket_w);

        // 3 add() method
        List<String> list1 = new ArrayList<>();
        String [] items = {"apple", "banana", "cherry"};
        for (String item: items) {
            list1.add(item);
        }
        // System.out.println(list1);
        // >> [apple, banana, cherry]

        // 4 Java Streams (range - integers: IntStream + range)
        List<Integer> arr_Int = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        System.out.println(arr_Int);

        // 4 Java Streams (String: Stream)
        List<String> months = Stream.of("January", "February", "March", "April", "May")
                .collect(Collectors.toList());
        System.out.println(months);

        // 5 Collections
        List<String> my_list = Collections.EMPTY_LIST;
        Collections.addAll(my_list = new ArrayList<>(), "id", "username", "first_name", "last_name");
        System.out.println(my_list);

        /**
         * *** HashSet ***
         */
        String[] basket = new String[] {"apple", "banana", "cherry", "plum", "cherry", "pear", "plum"};
        List<String> new_basket = List.of(basket);
        Set<String> fruit_set = new HashSet<>();
        fruit_set.addAll(new_basket);
        // System.out.println(fruit_set);
        // >>> [banana, plum, apple, cherry, pear]

    }
}
