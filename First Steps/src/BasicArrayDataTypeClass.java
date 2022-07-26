import java.util.ArrayList;
import java.util.List;

public class BasicArrayDataTypeClass {

    // Integer [] array
    static int IntegerOutput(Integer[] IntArray) {
        for (int i=0; i < IntArray.length; i++) {
            System.out.println(IntArray[i]);
        }

        // should return int value as assigned when defining method;
        return 1;
    }

    // int [] array
     static int intOutput(int [] intArray) {
        for (int i=0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        return 1;
    }

    // declaring lists
    static int declareArrayofInts(int... args) {
        // declare an array of ints way#2
        int[] arr;
        // allocating memory for 5 integers
        arr = new int[5];
        // System.out.println(arr[0]);
        // will raise an Exception as index out of range
        // array is empty
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 11;
        arr[3] = 15;
        arr[4] = 19;
        // arr[5] = 23;
        // will raise an Exception, index out of range
        // as array consists of 5 items
        System.out.println(arr);

        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return 1;
    }

    // ArrayList
    static int ArrayListOutput(ArrayList <String> slist) {
        // fulfill the ArrayList with add() method
        slist.add("John Doe");
        slist.add("Jack Jones");
        slist.add("Richard Roe");
        // slist.add(1);
        // will raise an Exception as the ArrayList of String elements
        // cannot contain non-string elements

        // slist has size as oppose to length
        System.out.println(slist);
        // >>> size of 3 objects

        // get type of the object (variable)
        System.out.println(slist.getClass().getSimpleName());

        for (int i=0; i < slist.size(); i++) {
            System.out.println(slist.get(i));
        }
        return 1;
    }

    // List
    static int MyListOutput (List <String> plist) {
        // List belongs to ArrayList --> get datatype here
        System.out.println(plist.getClass().getSimpleName());

        // add() method
        plist.add("apple");
        plist.add("banana");
        plist.add("cherry");

        // indexOf() method
        int apple_index = plist.indexOf("apple");
        System.out.println(apple_index);

        // toString() method converts array into a str
        String stringified = plist.toString();
        System.out.println(stringified);

        // get type of tringified list
        String type_of = plist.getClass().getSimpleName();
        String type_of_stringified = String.format("A type of stringified list is: %s", type_of);
        System.out.println(type_of_stringified);

        // checks whether the ArrayList is empty
        boolean result = plist.isEmpty();
        System.out.println(result);
        // >>> false

        // get() method gets the object from the list
        for (int i=0; i < plist.size(); i++) {
            System.out.println(plist.get(i));
        }
        return 1;
    }

    static int ArrayListIntOutput(ArrayList arrInt) {

        // arrInt.add(1);
        // arrInt.add(2);
        // arrInt.add(3);


        System.out.println(arrInt.getClass().getSimpleName());
        System.out.println();
        return 1;
    }

    public static void main(String[] args) {
        // declare an array on integers
        Integer [] IntArray = {10,20,30,40,50,60,70,80};
        // IntegerOutput(IntArray);

        // declare an array of ints way#1
        int [] intArray = {5,10,15,20,25,30,35,40};
        // intOutput(intArray);

        // declaring a simple list with 5 elements
        // allocating memory for 5 integers
        // declareArrayofInts();

        // assign ArrayList of string elements
        ArrayList <String> slist = new ArrayList <> ();
        // ArrayListOutput(slist);

        // assign List of string elements
        List <String> plist = new ArrayList <> ();
        // MyListOutput(plist);

        ArrayList <Integer> int_list = new ArrayList <> ();
        ArrayListIntOutput(int_list);

    }

}
