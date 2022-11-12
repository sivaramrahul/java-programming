/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.fileoperations;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author RAHUL
 */
public class Fileoperations {

    public static void main(String[] args) {
        try {
            FileWriter newfile = new FileWriter("D:\\TEST\\javafile.txt");
            String str="java file handling";
            newfile.write(str);
            newfile.close();
        } catch (IOException e) {

            System.out.print(e.getMessage());
        }

    }
}
