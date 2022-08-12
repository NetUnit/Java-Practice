package OOP;

public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        // we cannot define variable myObj again as it has been already reserved as the object in scope of
        // this class memory
        // compiler will throw an error saying another variable declared with the same name
        Main myObj2 = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
    }

    public static class AccessAttrsExampleClass {

        int a = 10;
        int b = 20;

        static void GetAttributes () {
            Object instance = new AccessAttrsExampleClass();
            System.out.println(instance);

        }

    }
}

class Second {
    // variables in Java created only within scope of the class
    // other than in python where * variables are dynamic
    // U cannot reassign the variable inside class as this doesn't make any sense
    // compilation can't be executed
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        int a = 1;
        // int a = 2; // java: variable a is already defined in method main(java.lang.String[])
    }
}

