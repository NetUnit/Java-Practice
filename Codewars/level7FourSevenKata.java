import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class level7FourSevenKata {
    int input4 = 4;
    int input7 = 7;
    int sum = input4 + input7;
    // solution 1 - compare
    public static int fourSeven(int number) {
        level7FourSevenKata instance = new level7FourSevenKata();
        int residue = instance.sum - number;
        String field_pattern = String.format("input%s", residue);
        try {
            Field field = instance.getClass().getDeclaredField(field_pattern);
            int value = field.getInt(instance);
            return value;
        } catch (NoSuchFieldException | IllegalAccessException error) {
            return 0;
        }
    }
    // solution 2 - get index of element
    public static int fourSeven1(int number) {
        level7FourSevenKata instance = new level7FourSevenKata();
        int residue = instance.sum - number;
        ArrayList<Integer> arr = new ArrayList<Integer>(2);
        arr.add(instance.input4);
        arr.add(instance.input7);
        try {
            int index = arr.indexOf(number);
            int result = arr.get(1 - index);
            return result;
        } catch (IndexOutOfBoundsException error) {
            return 0;
        }
    }
    // solution 3 - contains and Zero Division Error
    public static int fourSeven2(int number) {
        ArrayList<Integer> arr = new ArrayList <Integer> (Arrays.asList(4, 7));
        boolean result = arr.contains(number);
        int bool_value = Boolean.compare(result, false);

        try {
            int abs_num = number / bool_value;
            return 11 - number;
        } catch (ArithmeticException error) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] test_list = {7, 4 , 8, 9};
        // method#1
        System.out.println(fourSeven(test_list[0]));
        System.out.println(fourSeven(test_list[1]));
        System.out.println(fourSeven(test_list[2]));
        System.out.println(fourSeven(test_list[3]));
        // method#2
        System.out.println(fourSeven1(test_list[0]));
        System.out.println(fourSeven1(test_list[1]));
        System.out.println(fourSeven1(test_list[2]));
        System.out.println(fourSeven1(test_list[3]));
        // method#3
        System.out.println(fourSeven2(test_list[0]));
        System.out.println(fourSeven2(test_list[1]));
        System.out.println(fourSeven2(test_list[2]));
        System.out.println(fourSeven2(test_list[3]));
    }
}
