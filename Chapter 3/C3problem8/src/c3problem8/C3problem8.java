/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3problem8;

import java.util.*;

/**
 *
 * @author Farhad
 */
public class C3problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double celsiusValue, fahrenheitValue;
        
        System.out.println("Enter temperature in celsius: ");
        Scanner scanner = new Scanner(System.in);
        celsiusValue = scanner.nextDouble();
        
        fahrenheitValue = 1.8 * celsiusValue + 32;
        
        System.out.println("Temperature in fahrenheit: "+fahrenheitValue);
        
    }
    
}
