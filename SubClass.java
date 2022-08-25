class SuperClass {
    int age = 90;
    String name = "James";

    SuperClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void getAge() {
        System.out.println("The age is  " + age + "name is  " + name);
    }

}

public class SubClass extends SuperClass {
    SubClass(int age, String name) {
        super(age, name);
    }

    public static void main(String args[]) {
        SubClass s = new SubClass(55, "mike");
        s.getAge();
    }
}
