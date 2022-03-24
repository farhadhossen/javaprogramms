/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4pronlem8;

import java.text.DecimalFormat;

/**
 *
 * @author FARHAD
 */
public class C4Pronlem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CelsiusClass celsiusClass = new CelsiusClass();
        celsiusClass.setCelsius();
        
        FahrenheitClass fahrenheitClass = new FahrenheitClass();
        fahrenheitClass.setFahrenheit(celsiusClass.getCelsius());
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Your temperature in fahrenheit is: "+df.format(fahrenheitClass.getFahrenheit()));
    
        
    }
    
}
