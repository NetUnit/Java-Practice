import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// import static sun.nio.ch.DatagramChannelImpl.AbstractSelectableChannels.forEach;

public class BasicTrialMapClass {

        static String stringify(Object arg1) {
            return arg1.toString();
        }

        static List<String> get_result(List arr_list) {
            // item of arr_list: List<Integer> - Integer Object
            // item of arr_list: List<String> - String object
            List<String> new_list = new ArrayList <> ();

            for (int i=0; i < arr_list.size(); i++) {
                String value = stringify(arr_list.get(i));
                new_list.add(value);
            }
            // System.out.println(new_list.get(1).getClass().getSimpleName());
            return new_list;
        }

        static List<Integer> use_map_to_int(String... args) {
            // System.out.println(args.getClass().getSimpleName());
            // args is String[] datatype
            // convert sequence to list
            List<String> list_of_strs = Arrays.asList(args);

            // convert every str element of the list into Integer
            List<Integer> list_of_Integers = list_of_strs.stream().map(s ->
                    Integer.parseInt(s)).collect(Collectors.toList());
            return list_of_Integers;
        }

         static List<String> use_map_to_string(List<Integer> arr_list) {
             /**
              * represents several methods of maping & converting each elememnt of array
              * into another datatype
              * @param arr_list -  list of Integer Objects created with range
              * <p>
              * *** construction 1 *** (1)
              * using method reference operator (double colon (::) operator)
              * * *** construction 2 *** (2)
              * using lambda expression: map( <Type of Object> -> <Object.method(arg)>
              * *** construction 3 *** (3)
              * using lambda expression with own function
              * map( <Type of Object> -> <own_function(arg)>
              * <p>
              * additional data is here:
              * https://stackoverflow.com/questions/18524/converting-listinteger-to-liststring
              */

             // *** construction 1 ***
             // List<String> list_of_strs = arr_list.stream().map(Object::toString).collect(Collectors.toList());

             // *** construction 2 ***
             // List<String> list_of_strs = arr_list.stream().map((Object IntegerObject)
             //        -> String.valueOf(IntegerObject)).collect(Collectors.toList());

             // *** own construction ***
             List<String> list_of_strs = arr_list.stream().map((Object IntegerObject)
                     -> stringify(IntegerObject)).collect(Collectors.toList());
             return list_of_strs;
         }
        public static void main (String[] args) {
            List<Integer> st_range = IntStream.range(10, 21).boxed().collect(Collectors.toList());
            // System.out.println(get_result(st_range));

            List<Integer> list_of_Integers = use_map_to_int("-1" , "2", "3", "4", "5");
            // System.out.println(list_of_Integers.get(1).getClass().getSimpleName());
            // System.out.println(list_of_Integers);

            List<String> list_of_strs = use_map_to_string(st_range);
            System.out.println(list_of_strs);
    }
}
