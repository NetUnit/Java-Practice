import java.lang.*;
import java.unit.List;

// https://stackoverflow.com/questions/11973505/what-is-the-difference-between-string-and-string-in-java
public class BasicStringIntArgsClass {
    static void stringMethodArgs (String...args) {
        String sv1 = args[0];
        String sv2 = args[1];
        String sv3 = args[2];
        String sv4 = String.format("Fruit basket: %s, %s, %s", sv1, sv2, sv3);
        System.out.println(sv4);
    }

    static void StringArrayClass(String[] args) {
        String uf1 = args[0];
        String uf2 = args[1];
        String sv3 = String.format("User fields: first_name: %s, last_name: %s", uf1, uf2);
        System.out.println(sv3);
    }

    // Integer.MAX_VALUE=2147483647, MIN_VALUE=-2147483647
    static void intMethodArgs(int... args) {
        int intv1 = args[0];
        int intv2 = args[1];
        // can add only 2 values through int method
        System.out.println("Total of those ints is = " + Integer.sum(intv1, intv2));
    }

    // interface
    // collection ---> list {}
    // collection ---> set {}
    //
    public static void main (String[] args) {
        // using escape character to avoid double quotes error
        stringMethodArgs("\"apple\"", "banana", "cherry");
        intMethodArgs(3, 7, 9);
        // StringArrayClass(new String[]{"John", "Doe"});
        List <String> slist = new ArrayList <> ();
        StringArrayClass(new String[]{"John", "Doe"});
     }
}