/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4problem7;

import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class FahrenheitClass {
    
    
    private double tempInFahrenheit;
    
    
    public double getFahrenheit(){
        
        
        return tempInFahrenheit;
    }
    
    public void setFahrenheit(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your temperature in fahrenheit: ");
        tempInFahrenheit = (double) sc.nextDouble();
    }
    
}
