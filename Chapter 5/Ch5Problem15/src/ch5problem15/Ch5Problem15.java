/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5problem15;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Ch5Problem15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a, b, c, perimeter, area;
        Ch5Triangle triangle;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        
        System.out.print("Enter c: ");
        c = scanner.nextDouble();
        
        triangle = new Ch5Triangle(a,b,c);
        
        
        perimeter = triangle.getPerimeter();
        area =  triangle.getArea();
        
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        
        
    }
    
}
