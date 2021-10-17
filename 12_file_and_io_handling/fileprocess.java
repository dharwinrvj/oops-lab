import java.util.*;
import java.io.*;

public class fileprocess {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the filename");
        String filename = obj.next();
        File f = new File(filename);
        System.out.println("INFORMATION OF THE FILE");
        char s;
        do {
            System.out.println("Enter 1 for availability of the file\n"
                    + "Enter 2 to find readable or writable or both\n" + "Enter 3 to find the type of the file\n"
                    + "Enter 4 to find ength of the file in bytes\n");
            int a = obj.nextInt();
            switch (a) {
                case 1: {
                    System.out.println("Availability: " + f.exists());
                    break;
                }
                case 2: {
                    if (f.canRead() && f.canWrite()) {
                        System.out.println("The file is both readable and writable");
                    } else if (f.canRead()) {
                        System.out.println("The file is readable");

                    } else if (f.canWrite()) {
                        System.out.println("The file is writable");
                    } else {
                        System.out.println("Undefined property");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Type of the file: " + filename.substring(filename.lastIndexOf('.') + 1));

                    break;
                }
                case 4: {
                    System.out.println("Length of the file in bytes: " + f.length() + " bytes");
                    break;
                }

            }

            System.out.println("enter 'y' to continue ");
            s = obj.next().charAt(0);
        } while (s == 'y' || s == 'Y');

    }
}