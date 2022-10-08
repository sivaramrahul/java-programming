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
        Circle myCircle = new Circle(6);
        double area = myCircle.area();
        System.out.print(area);
        
        Rectangle myRectangle = new Rectangle(5,6);
        area = myRectangle.area();
        System.out.print(area);
    }
}
