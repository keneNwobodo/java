public class MyFirstJavaProgram {
    // print hello world
    // local variables

    public void pupAge() {
        int age = 10;
        age += 7;
        System.out.println("My age is " + age);
    }

    public static void main(String []args) {
        // create an instance of the class
        MyFirstJavaProgram test = new MyFirstJavaProgram();
        // call the method pupAge
        test.pupAge();

        String name = "John";

        // instanceof
        boolean result = name instanceof String;
        System.out.println("Instance of String is :" + result);

        // variable initialization
        int a, b;
        a = 1;

        // ternary operator
        b = (a == 10) ? 20 : 30;
        System.out.println("The value of b is :  " + b );

        b = (b == 1) ? 20 : 50;
        System.out.println("The value of b here is >> " + b);

        System.out.println("Hello, World!");
    }
}


