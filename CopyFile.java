import java.io.*;

public class CopyFile {
    public static void main(String args[]) throws IOException {
        // set both streams to null
        FileInputStream in = null;
        FileOutputStream out = null;

        // specify the variables and assign null
        FileReader file_in = null;
        FileWriter file_out = null;

        InputStreamReader cin = null;

        // create the
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

        try {
            file_in = new FileReader("filereader.txt");
            file_out = new FileWriter("filewriter.txt");

            int c;
            while ((c = file_in.read()) != -1) {
                file_out.write(c);
            }
        } finally {
            if (file_in != null) {
                file_in.close();
            }

            if (file_out != null) {
                file_out.close();
            }

        }

        try {
            byte bWrite[] = { 11, 23, 3, 40, 7 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + " ");
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }

        try {
            cin = new InputStreamReader(System.in);
            System.out.print("Enter characters, 'q' to quit");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while (c != 'q');
        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}