public class BasicIntegerAddClasses {

    // adding values in sequence - void is excessive
    static int AddingValues(int... args) {
        int start = 0;
        for (int i=0; i < args.length; i++) {
            start += args[i];

            // ask about return here
            if (i == args.length - 1)
                return start;
        }
        // System.out.println(args.length);
        // System.out.println(start);
        return start;
    }


    public static void main (String[] args) {
        int result = AddingValues(1, 2, 3, 4, 5);
        System.out.println(result);
    }
}

