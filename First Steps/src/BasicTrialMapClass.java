import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicTrialMapClass {

        static String stringify(Object arg1) {
            return arg1.toString();
        }

        static List<String> get_result(List arr_list) {
            List<String> new_list = new ArrayList <> ();

            for (int i=0; i < arr_list.size(); i++) {
                String value = stringify(arr_list.get(i));
                new_list.add(value);
            }

            return new_list;
        }

        public static void main (String[] args) {

            List<Integer> st_range = IntStream.range(10, 21).boxed().collect(Collectors.toList());
            System.out.println(get_result(st_range));

    }




}
