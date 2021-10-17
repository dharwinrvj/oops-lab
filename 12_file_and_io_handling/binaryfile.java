import java.io.*;

public class binaryfile {
    public static void main(String[] args) {

        try {
            FileInputStream fi = new FileInputStream("1.png");
            FileReader fr = new FileReader("1.png");
            FileOutputStream fo = new FileOutputStream("3.png");
            FileWriter fw = new FileWriter("2.png");
            int read = 0;
            while ((read = fi.read()) != -1) {
               fo.write(read);
            }
            while ((read = fr.read()) != -1) {
                System.out.print(read);
               fw.write(read);
            }
            fi.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
