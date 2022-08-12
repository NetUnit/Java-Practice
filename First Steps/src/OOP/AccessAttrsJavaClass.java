package OOP;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccessAttrsJavaClass {
    int a = 5;
    int b = 10;

    // standard method of getting attributes
    static void getAttribute1() {
        AccessAttrsJavaClass instance = new AccessAttrsJavaClass();
        // System.out.println(instance.a);
        // System.out.println(instance.b);
    }

    // in the runtime
    static void getAttribute2() {
        /**
         * represents getDeclaredFiled method: All the fields, regardless of their accessibility but only for the
         * current class, not any base classes that the current class might be inheriting from
         * *** Difference with getField ***
         * getField: Gets * the public fields up the entire class hierarchy.
         * getDeclaredField - gets not public fields.
         * <p>
         * additional data is here:
         * https://stackoverflow.com/questions/16966629/what-is-the-difference-between-getfields-and-getdeclaredfields-in-java-reflectio
         * @return object attributes a & b got in the runtime
         */
        Object instance = new AccessAttrsJavaClass();
        try {
            // get instance value "a" as an object
            Field field1 = instance.getClass().getDeclaredField("a");
            Object value1 = field1.get(instance);
            System.out.println(value1);
            // / get instance value "b" as an object
            Field field2 = instance.getClass().getDeclaredField("b");
            int value2  = field2.getInt(instance);
            System.out.println(value2);
        } catch (NoSuchFieldException | IllegalAccessException error) {
            System.out.println(error);
        }
    }

    static void getAllAttributes() {
        Object instance = new AccessAttrsJavaClass();
        Field[] fields = instance.getClass().getDeclaredFields();
        // get lis tof fields
        System.out.println(fields);
        List<Integer> attrs = new ArrayList<>();
        try {
            for (Field field: fields) {
                attrs.add(field.getInt(instance));
            }
            // get list of attribute values
            System.out.println(attrs);
        } catch (IllegalAccessException error) {
            System.out.println(error);
        }
    }

    static void getAllAttributes2() {
        Object instance = new AccessAttrsJavaClass();
        Field[] fields = instance.getClass().getDeclaredFields();
        List<Field> fieldList = Arrays.asList(fields);
        System.out.println(fieldList);
        // accessing the field value
        try {
            System.out.println(fieldList.get(1).get(instance));
        } catch (IllegalAccessException error) {
            System.out.println(error);
        }
    }

    public static void main(String[] attrs) {
        getAttribute1();
        getAttribute2();
        getAllAttributes();
        getAllAttributes2();
    }
}