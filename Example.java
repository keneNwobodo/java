interface Animal {
    public void eat();

    public void travel();
}

public class Example implements Animal {
    public void eat() {
        System.out.println("Mammal Eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        Example e = new Example();
        e.eat();
        e.travel();
    }
}
