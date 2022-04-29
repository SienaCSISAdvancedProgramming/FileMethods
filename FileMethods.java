import java.io.File;
import java.io.IOException;

/**
 * Demonstration of more of the methods of the java.io.File class
 * 
 * @author Jim Teresco
 * @version Spring 2022
 */
public class FileMethods {

    /**
     * Main method for this demonstration
     * 
     * @param args[0] the path/name of a file to use to construct a File object
     */
    public static void main(String[] args) throws IOException {

        // our program requires a file name parameter
        if (args.length != 1) {
            System.err.println("Usage: java FileMethods filename");
            System.exit(1);
        }

        // now let's create a File object and see some things about this path
        File f = new File(args[0]);

        // There are many things we can do, so let's try some
        System.out.println("toString of this file: " + f);
        System.out.println(".exists(): " + f.exists());
        System.out.println(".canRead(): " + f.canRead());
        System.out.println(".canWrite(): " + f.canWrite());
        System.out.println(".canExecute(): " + f.canExecute());
        System.out.println(".getAbsolutePath(): " + f.getAbsolutePath());
        System.out.println(".getCanonicalPath(): " + f.getCanonicalPath());
        System.out.println(".getName(): " + f.getName());
        System.out.println(".getParent(): " + f.getParent());
        System.out.println(".isAbsolute(): " + f.isAbsolute());
        System.out.println(".isDirectory(): " + f.isDirectory());
        System.out.println(".isFile(): " + f.isFile());
        System.out.println(".isHidden(): " + f.isHidden());
        System.out.println(".lastModified(): " + f.lastModified());
        System.out.println(".length(): " + f.length());

    }
}
