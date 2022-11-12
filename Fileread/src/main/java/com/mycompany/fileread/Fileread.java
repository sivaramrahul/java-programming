/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.fileread;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author RAHUL
 */
public class Fileread {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\TEST\\javafile.txt");

            // Declaring loop variable
            int i;
            // Holds true till there is nothing to read
            while ((i = fr.read()) != -1) // Print all the content of a file
            {
                System.out.print((char) i);
            }
        } catch (IOException e) {

            System.out.print(e.getMessage());
        }
    }
}
