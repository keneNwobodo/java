import java.io.*;

public class DeserialzeDemo {

    public static void main(String args[]) {
        Employee e = null;
        try {
            // read the file
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println();
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
