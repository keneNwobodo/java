class Outer_Demo {
    int num;

    // private variable
    private int num1 = 105;

    // inner class
    private class Inner_Demo {
        public void print() {
            System.out.print("This is an inner class");
        }
    }

    // innner class 2
    public class Inner_Demo2 {
        public int getNum() {
            System.out.println("This is the second method");
            return num1;
        }
    }

    // accessing the inner class
    void display_inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

public class My_class {
    public static void main(String args[]) {
        Outer_Demo outer = new Outer_Demo();
        outer.display_inner();

        // instatntiate the inner class
        Outer_Demo.Inner_Demo2 inner = outer.new Inner_Demo2();
        System.out.println(inner.getNum());
    }
}