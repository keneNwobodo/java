import java.io.File;

public class ReadDir {
    public static void main(String args[]) {
        File file = null;
        String[] paths;
        try {
            // create a new file
            file = new File("/tmp");

            // array of files and object
            paths = file.list();

            for (String path : paths) {
                // pint filenames and directories
                System.out.print(path);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
