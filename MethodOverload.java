public class MethodOverload {
    public static void main(String args[]) {
        int a = 12;
        int b = 9;
        double c = 10.5;
        double d = 12.69;

        // command line args
        for (int i = 0; i < args.length; i++) {
            System.out.println("args is [ " + i + "]" + args[i] + " + args[i]");
        }

        // method overload - two method names with different parameters
        int result1 = minFunction(a, b);
        double result2 = minFunction(c, d);

        System.out.print("The min value for int datatype is " + result1);
        System.out.print("\n");
        System.out.print("The min value for double datatype is " + result2);
    }

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
}
