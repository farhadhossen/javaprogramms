/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4problem14;

/**
 *
 * @author Farhad
 */
public class WeightConverter {
    
    private double weightDiff;
    
    public WeightConverter(double WeightDiff){
        weightDiff = WeightDiff;
    }
    
    public double convert(double eWeigth){
        
        
        return eWeigth * weightDiff;
    }
}
