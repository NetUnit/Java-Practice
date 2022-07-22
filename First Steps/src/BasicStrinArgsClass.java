import java.lang.*;
public class BasicStrinArgsClass {
    static void stringMethodArgs (String...args) {
        String sv1 = args[0];
        String sv2 = args[1];
        String sv3 = args[2];
        String sv4 = String.format("Fruit basket: %s, %s, %s", sv1, sv2, sv3);
        System.out.println(sv4);
    }

    static void intMethodArgs(int... args) {
        int intv1 = args[0];
        int intv2 = args[1];
        int intv3 = args[2];
        // public static int sum(int intv1, int intv2, int intv3);
        // int total = Integer.sum(int intv1, int intv2, int intv3);
        // String result = String.format("Ints: %d, %d, %d | Used formatting", intv1 , intv2, intv3);
        // System.out.println(result);
        // can add only 2 values
        System.out.println("Total of those ints is = " + Integer.sum(intv1, intv2));
    }
    public static void main (String[] args) {

        // using escape character to avoid double quotes error
        stringMethodArgs("\"apple\"", "banana", "cherry");
        intMethodArgs(3, 7, 9);
     }
}