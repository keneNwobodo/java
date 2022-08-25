class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given number is " + z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The minus of the given number is " + z);
    }

}

public class My_Calculation extends Calculation {
    public void multplication(int x, int y) {
        z = x * y;
        System.out.print("The product of the given numbers " + z);
    }

    public static void main(String args[]) {
        int a = 30, b = 5;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multplication(a, b);

    }
}
