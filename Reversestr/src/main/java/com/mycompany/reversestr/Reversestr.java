/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.reversestr;

/**
 *
 * @author RAHUL
 */
public class Reversestr {

    public static void main(String[] args) {

        String str = "My name is Rahul", nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); 
            nstr = ch + nstr; 
        }
        System.out.println("Reversed word: " + nstr);
    }
}


