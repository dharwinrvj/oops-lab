/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.*;
/**
 *
 * @author dharwin
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) throws IOException {
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

    static void countLines(String fileName) throws IOException {
        BufferedReader in; // A stream for reading from the file.
        int count;
        String line;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            System.out.println("Error. Can't open file.");
            return;
        }
        count = 0;
        try {
            while ((line = in.readLine()) != null) {
                // Splits each line into words
                String words[] = line.split(" ");
                // Counts each word
                count = count + words.length;
                
            }
        } catch (Exception e) {
            System.out.println("Error. Problem with reading from file.");
            return;
        }
        System.out.println("Number of words: " + count);
        in.close();
    }
}