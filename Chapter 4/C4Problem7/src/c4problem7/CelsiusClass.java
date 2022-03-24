/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4problem7;

/**
 *
 * @author FARHAD
 */
public class CelsiusClass {
    
    private double tempInCelsius;
    
    
    public double getCelsius(){
        

        return tempInCelsius;
    }
    
    public void setCelsius(double f){
        

        tempInCelsius = ((double)5/(double)9)*(f-32);

        
    }
}
