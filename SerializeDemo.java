import java.io.*;

class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + "  " + address);
    }
}

public class SerializeDemo {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.name = "Kenechukwu Emma";
        e.address = "Lagos, Nigeria";
        e.SSN = 1234555;
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is serialized in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
