import java.util.List;
import java.util.stream.IntStream;

public class BasicGetArrayfromRangeClass {
    // method does not take any args
    static List<Integer> GetArrayfromRange() {
    // using range of ints with IntStream to conform list;
    // 1
    IntStream st = IntStream.range(32, 45);
    // 2
    // List <Integer> list_from_range = st.boxed().collect(Collectors.toList());
    List <Integer> list_from_range = st.boxed().toList();
    // 3
    // List <Integer> list_from_range = st.collect(ArrayList::new, List::add, List::addAll
    return list_from_range;
    }

    public static void main (String[] args) {
        List<Integer> array_from_range = GetArrayfromRange();
        System.out.println(array_from_range);
        System.out.println(array_from_range.getClass().getSimpleName());
    }
}
