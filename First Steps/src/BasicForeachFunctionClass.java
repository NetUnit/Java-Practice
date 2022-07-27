import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicForeachFunctionClass {
    // converts sequence to List <String>
    static List<String> from_String_to_List (String[] args) {
        List<String> List_of_strings = new ArrayList<> ();
        for (String item: args) {
            List_of_strings.add(item);
        }
        return List_of_strings;
    }
    static void applyforEach(List<String> arr_list) {
        /**
         * represents forEach method to iterate over the collections and Streams in Java
         * Collection classes use forEach loop to iterate elements
         * @param arr_list -  list of String Objects
         * <p>
         * forEach method - apply lambda expression to every element of iterable
         * lambda expression - converts every String element into Integer
         * <p>
         * additional data is here:
         * https://www.w3schools.blog/java-8-foreach-exampleng
         */
        System.out.println(arr_list.get(0).getClass().getSimpleName()); // get type of income array element --> string
        List<Integer> Integer_list = new ArrayList <> ();
        arr_list.forEach(
                str_item -> Integer_list.add(Integer.parseInt(str_item))
        );
        System.out.println(Integer_list);
        // check type of list value after conversion itself:
        // gets type of income array element --> Integer
        System.out.println(
                Integer_list.get(0).getClass().getSimpleName()
        );
    }

    public static void main (String[] args) {
        // fulfill the arr with string values:
        // *** 1st list
        List<String> list_of_Str_1 =  from_String_to_List(new String[] {"5", "10", "15", "20", "25"});
        applyforEach(list_of_Str_1);

        // *** 2nd list
        List<String> list_of_Str_2  = Arrays.asList(new String[] {"8", "10", "14", "20", "28" });
        applyforEach(list_of_Str_2);

        // *** 3rd list
        String [] some_arr3 = {"3", "7", "10", "13"};
        List<String> list_of_Str_3 = from_String_to_List(some_arr3);
        applyforEach(list_of_Str_3);

    }

}
