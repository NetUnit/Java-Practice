package OOP;

import java.lang.reflect.Field;
import java.util.*;

public class AccessAttrsJavaClass {
    int a = 5;
    int b = 10;
    public String city = "Lviv";
    public String state = "Ukraine";

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
         * <p>
         *  toDict2() - uses HashMap, datatype to store "key/value" pairs.
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
        List<Object> attrs = new ArrayList<>();
        try {
            for (Field field: fields) {
                // in case all object attrs r Integers
                // attrs.add(field.getInt(instance));
                attrs.add(field.get(instance));
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

    static void toDict1() {
        AccessAttrsJavaClass instance = new AccessAttrsJavaClass();
        Dictionary<String, Object> ret = new Dictionary<String, Object>() {
            @Override
            public int size() {
                return 2;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration<String> keys() {
                return null;
            }

            @Override
            public Enumeration<Object> elements() {
                return null;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(String key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }
        };


        List<Field> fields = Arrays.asList(instance.getClass().getDeclaredFields());
        fields.forEach(field -> {
            try {
                ret.put(field.getName(), field.get(instance));
                System.out.println(field.getName());
                System.out.println(field.get(instance));
            } catch (IllegalAccessException error) {
                System.out.println(error);
            }
        });
        System.out.println(ret);
        System.out.println(ret.keys());
        System.out.println(ret.get("state"));
    }

    // Hash Map is a pythons dict
    static void toDict2() {
        AccessAttrsJavaClass instance = new AccessAttrsJavaClass();
        List<Field> fields = Arrays.asList(instance.getClass().getDeclaredFields());
        Map dict = new HashMap();
        fields.forEach(field -> {
            try {
                dict.put(field.getName(), field.get(instance));
            } catch (IllegalAccessException error) {
                System.out.println(error);
            }
        });
        System.out.println(dict);
        // get * keys
        System.out.println(dict.keySet());
        // get * values
        System.out.println(dict.values());
        // get * pairs
        System.out.println(dict.entrySet());
    }

    static void fromObjtoDict() {
        return;
    }
    public static void main(String[] attrs) {
        getAttribute1();
        getAttribute2();
        getAllAttributes();
        getAllAttributes2();
        // toDict1();
        toDict2();
        fromObjtoDict();

    }
}