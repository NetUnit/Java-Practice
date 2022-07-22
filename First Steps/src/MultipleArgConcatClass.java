public class MultipleArgConcatClass {
    // passing several parameters into method
    static void concatMethod(String arg1, String arg2) {
        // %s - string format specifier
        String sf1 = String.format("%s: has been added; ", arg1);
        String sf2 = String.format("%s: has been added; ", arg2);
        System.out.println(sf1+ sf2);
    }

    public static void main(String[] args) {
        concatMethod("string1", "string2");
    }
}
