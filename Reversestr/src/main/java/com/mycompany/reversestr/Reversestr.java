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

        String str = "hello", nstr = "";
        char ch;

        for (int i = str.length()-1; i >=0; i--) {
            ch = str.charAt(i); 
            nstr = nstr + ch; 
        }
        System.out.println("Reversed word: " + nstr);
    }
}


