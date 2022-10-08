/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author RAHUL
 */
public class Rectangle {

    //field
    int length;
    int breadth;

    //constructor

    public Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    

    //method
    public int area() {
        int area = length * breadth;
        return area;
    }

}
    

