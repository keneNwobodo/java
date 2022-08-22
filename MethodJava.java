public class MethodJava {
    // minimum method
    public static int minFunc(int a, int b) {
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }

        return min;
    }

    // void method
    public static void methodRankPoints(double points) {
        if (points >= 200.56) {
            System.out.println("Rank:A1");
        } else if (points >= 125.65) {
            System.out.println("Rank:A2");
        } else {
            System.out.println("Rank:A3");
        }
    }

    // swap values method
    public static void swapFunc(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Swap insise the func a =  " + a + "b = " + b);
 
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 12;
        int c = minFunc(a, b);
        System.out.println("Minimum value is " + c);

        int d = 20;
        int e = 15;

        swapFunc(d, e);
        System.out.println("\n*** AFTER SWAPPING!");
        System.out.println("After swapping" + d + " " + e);

        // method rank points method
        methodRankPoints(100.22);
    }
}
