public class This_Example {
    int num = 10;

    This_Example() {
        System.out.println("This is an example program on the keyword this");
    }

    This_Example(int num) {
        // call the method above ont this
        this();

        // asssign local varibale num to the instance variable num
        this.num = num;
    }

    public void greet() {
        System.out.println("Hi Welcome to tutorialpoint");
    }

    public void print() {
        // local variable num
        int num = 10;

        // print the locak varibale
        System.out.println("Print the local varibale num " + num);

        // print the instance variable
        System.out.println("The instance variable num is " + this.num);

        // invoke the greet method
        this.greet();
    }

    public static void main(String args[]) {
        // instantiate the example class
        This_Example obj1 = new This_Example();

        // Ivke the print method
        obj1.print();

        // passing a parameter
        This_Example obj2 = new This_Example(35);

        // invoke the print method
        obj2.print();

        printMax(10, 40, 20, 60, 80, 15, 25.8);
        printMax(new double[] { 1, 2, 3 });

    }

    // printMax method
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No args passed");
            return;
        }
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
                System.out.println("The max value is " + result);
            }
        }
    }
}
