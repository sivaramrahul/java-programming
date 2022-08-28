/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author RAHUL
 */
public class Square {

    //field
    int side;

    //constructor
    public Square(int s) {
        side = s;
    }

    //method
    public int area() {
        int area = side * side;
        return area;
    }

}
