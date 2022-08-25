class Super_class {
    int num = 25;

    // dsplay method of super class
    public void display() {
        System.out.println("This is the display of the super class");
    }
}

public class Sub_class extends Super_class {
    int num = 10;

    // display method og sub claas
    public void display() {
        System.out.println("This is the display method fs the sub class");
    }

    public void my_method() {
        // instantiate subclass
        Sub_class sub = new Sub_class();

        // invoke the diplay method of the sub class
        sub.display();

        // invoke the display method of the super class
        super.display();

        System.out.println("This is the num value of the sub class  " + sub.num); 

        System.out.println("This is the num value of the super class  " + super.num);

    }

    public static void main(String args[]) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}
