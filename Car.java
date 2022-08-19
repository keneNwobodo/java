
// declared a super class
class Vehicle {
}

// sub class Car inherits from Vehicle class
public class Car extends Vehicle {
    public static void main(String []args){
        Vehicle a = new Car();
        boolean results = a instanceof Car;
        System.out.println("The instance of A is : " + results);

        // loop
        int [] numbers = {10, 5, 20, 1, 7, 8};

        // for loop
        for (int x : numbers) {
            System.out.println(x + ",");
        }

        System.out.println("\n");
        
        String [] names = { "James", "Tom", "Kene", "Mike" };
        
        for (String name : names) {
            System.out.println(name + ",");
        }
    }
}
