/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4problem7;

import java.text.DecimalFormat;

/**
 *
 * @author FARHAD
 */
public class C4Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FahrenheitClass fahrenheitClass = new FahrenheitClass();
        fahrenheitClass.setFahrenheit();
        
        
        CelsiusClass celsiusClass = new CelsiusClass();
        celsiusClass.setCelsius(fahrenheitClass.getFahrenheit());
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Your temperature in celsius is: "+df.format(celsiusClass.getCelsius()));
    }
    
}
