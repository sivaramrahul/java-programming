/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.factorial;

/**
 *
 * @author RAHUL
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 5, fact = 1;

        for (int i = 1; i <= n; ++i) {
            fact = fact * i;
        }

        System.out.print(fact);
    }
}