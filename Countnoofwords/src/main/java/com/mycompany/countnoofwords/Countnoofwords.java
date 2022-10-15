/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.countnoofwords;

/**
 *
 * @author RAHUL
 */
public class Countnoofwords {
    public static void main(String[] args) {
        String str;
 
        int count = 1;
        
        str = "My name is Rahul";
 
        for (int i = 0; i < str.length()-1; i++)
        {
            char ch = str.charAt(i);
            if ((ch == ' ') && ( ch + 1 != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}


