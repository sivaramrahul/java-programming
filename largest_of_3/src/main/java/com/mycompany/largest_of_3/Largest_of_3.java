/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.largest_of_3;

import java.util.Scanner;

/**
 *
 * @author RAHUL
 */
public class Largest_of_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest: " + num1);
        }

        if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest: " + num2);
        }

        if (num3 > num1 && num3 > num2) {
            System.out.println("The greatest: " + num3);
        }
    }
}
