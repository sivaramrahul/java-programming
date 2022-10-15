/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.fibonacci;

/**
 *
 * @author RAHUL
 */
public class Fibonacci {

    public static void main(String[] args) {

        int n = 10, n1 = 0, n2 = 1;
        

        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + ", ");

            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
}

