public class BasicConcatClass {
    // passing 1 parameter and concatenate
    static void someMethod(String arg1) {
        arg1 = arg1 + " is concatenated";
        System.out.println(arg1);
    }
    public static void main(String[] args) {
        someMethod("string1");
    }
}
