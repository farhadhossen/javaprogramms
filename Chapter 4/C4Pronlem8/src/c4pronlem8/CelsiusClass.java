/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4pronlem8;

import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class CelsiusClass {
    
    private double tempInCelsius;
    
    
    public double getCelsius(){
        

        return tempInCelsius;
    }
    
    public void setCelsius(){
        

        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your temperature in celsius: ");
        tempInCelsius = (double) sc.nextDouble();

        
    }
}
