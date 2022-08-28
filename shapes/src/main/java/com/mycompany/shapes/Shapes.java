/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.shapes;

/**
 *
 * @author RAHUL
 */
public class Shapes {

    public static void main(String[] args) {
        Square mySquare = new Square(5);
        int area = mySquare.area();
        System.out.print(area);
    }
}
