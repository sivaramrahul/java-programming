/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author RAHUL
 */
public class Circle {
    //field
    int radius;

    //constructor
    public Circle(int r) {
        radius = r;
    }

    //method
    public double area() {
        double area = 3.14 * radius * radius;
        return area;
    }
    
}
