public class EvenOddClass {
    String even = "Even";
    String odd = "Odd";
        public static String even_or_odd(int number) {
            boolean condition_even = number%2 == 0;
            EvenOddClass myObj = new EvenOddClass();
            if (condition_even) {
                return myObj.even;
            }
            else {
                return myObj.odd;
            }
        }

        public static void main(String[] args) {
            System.out.println(even_or_odd(6));
            System.out.println(even_or_odd(7));
            System.out.println(even_or_odd(0));
            System.out.println(even_or_odd(-1));
        }
}
