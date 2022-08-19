
import java.util.*;
import java.text.*;
import java.util.Date;
public class StringDemo {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
        
    public static void main(String[] args) {
        // new string
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        // lenght of strings
        int len = helloString.length();

        // concatenate strings
        String string1 = "Hey my name is John, you? ";
        String string2 = "I\'m Jospeh";
        System.out.println(string1.concat(string2));
       
        System.out.println(helloString);
        System.out.println(len);

        // array
        double[] myList = new double[10];
        System.out.println(myList);
        
        double[] myList2 = { 0.2, 0.4, 0.9, 0.6, 0.7 };

        for (int i = 0; i < myList2.length; i++) {
            System.out.println("The value i is  " + myList2[i]);
        }
        
        // summing all values
        double total = 0;
        for (int i = 0; i < myList2.length; i++) {
            total += myList2[i];
        }
        System.out.println("Total is : " + total);

        // find max number
        double max = 0;
        for (int i = 0; i < myList2.length; i++) {
            if (myList2[i] > max)
                max = myList2[i];
        }
        System.out.println("Max number is : " + max);

        // foreach
        for (double element : myList2) {
            System.out.println("for each value is : " + element);
        }
        
        // date
        Date date = new Date();
        System.out.print("date is " + date.toString());

        // simple format
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy/MM/dd 'at' hh:mm:ss a zzz");
        System.out.println("Cuurent date and time is : " + ft.format(dNow));  
        }
        
    }
 