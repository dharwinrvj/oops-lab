import java.io.*;
import java.util.*;
import java.lang.*;

public class fileread {
    public static void main(String[] args) {
        read t[] = new read[3];
        for (int i = 0; i < 3; i++) {
            t[i] = new read(args[i]);
            t[i].start();
        }
    }
}

class read extends Thread {
    String file;

    read(String s1) {
        this.file = s1;
    }

    public void run() {
        try {
            FileInputStream fr = new FileInputStream(file);
            int read = 0, count = 1;
            while ((read = fr.read()) != -1) {
                if (read == 32 || read == '\n' || read == 46)
                    count++;
            }
            System.out.println(file + ": " + count);
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
