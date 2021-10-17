/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author dharwin
 */

public class LineCountCmd {
    public static void main(String[] args) {
        if (args.length == 0) {
            // This program must have at least one command-line
            // argument to work with.
            System.out.println("Error. No file name is entered.");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + ": ");
            countLines(args[i]);
        }
    }

    static void countLines(String fileName) {
        BufferedReader in; // A stream for reading from the file.
        int lineCount;
        // Number of lines in the file.
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            System.out.println("Error. Can't open file.");
            return;
        }
        lineCount = 0;
        try {
            String line = in.readLine(); // Read the first line.
            while (line != null) {
                lineCount++;
                line = in.readLine();
            }
        }
        // Count this line.
        // Read the next line.}
        catch (Exception e) {
            System.out.println("Error. Problem with reading from file.");
            return;
        }
        System.out.println(lineCount + " lines");
    }
}