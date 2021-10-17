/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

/**
 *
 * @author dharwin
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LowerCase {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File filein = new File("one.txt");
        File fileout = new File("output.txt");
        BufferedReader br = (new BufferedReader(new FileReader(filein)));
        PrintWriter pw = (new PrintWriter(new FileWriter(fileout)));
        String line = null;
        while ((line = br.readLine()) != null) {
            pw.write(line.toLowerCase());
            pw.write("\n");
        }
        pw.close();
        br.close();
    }
}