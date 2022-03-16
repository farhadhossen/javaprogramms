/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4problem12;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Weight {
        private int userHeight, userAge;
        private double recommendedWeight;
    

    public Weight(int height, int age){
        userHeight = height;
        userAge = age;
    }
    
    public double getrecommendedWeight(){
        
        recommendedWeight = ((double)userHeight - 100 + (double)userAge / 10) * 0.90;
                
        return recommendedWeight;
    }
    

}
