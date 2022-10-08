/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minofnnos;

import java.util.Scanner;

/**
 *
 * @author RAHUL
 */
public class Minofnnos {

    public static void main(String[] args) {
        int len;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        len = s.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
          System.out.print("Enter the value of  " + i + " : " );
         
          arr[i] = s.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum value in the array is " + min );
    }    
}
