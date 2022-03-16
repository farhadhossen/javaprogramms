/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4problem14;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class EarthWeight {
    private double earthWeight;
    
    public double getEarthWeight(){
        
        return earthWeight;
    }
    
    public void setEarthWeight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Weight: ");
        earthWeight = sc.nextDouble();
    }
}
