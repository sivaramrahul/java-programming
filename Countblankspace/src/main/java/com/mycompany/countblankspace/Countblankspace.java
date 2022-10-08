/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.countblankspace;

/**
 *
 * @author RAHUL
 */
public class Countblankspace {

    public static void main(String[] args) {
        String str;
        int count = 0;

        str = "My name is Rahul ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        System.out.println("Total white space : " + count);
    }
}
