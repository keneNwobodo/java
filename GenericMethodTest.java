public class GenericMethodTest {
    // generic method printArray
    public static <E> void printArray(E[] inputArray) {
        // display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }

    public static void main(String args[]) {
        // Create arrays of integer, double, and character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("integer array contains");
        printArray(intArray);

        System.out.println("double array contains");
        printArray(doubleArray);

        System.out.println("character array contains");
        printArray(charArray);
    }
}
