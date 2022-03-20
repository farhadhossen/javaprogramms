/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recommendedweightwithtest;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class RecommendedWeight {
    
    private static double age, height, recommendedWeight;
    
    public static void setAgeAndHeight(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        age = sc.nextDouble();
        
        System.out.print("Enter height between 140cm and 230cm: ");
        height = sc.nextDouble();
    }
    
    public static void getRecommendedWeight(){
        
        if(height>140.00 &&  height<230.00){
                recommendedWeight = ((double)height - 100 + (double)age / 10) * 0.90;
                System.out.println("Your recommended is: "+recommendedWeight+" kg");
        }else{
            System.out.println("Please enter height between 140cm and 230cm");
        }
        
        
        
    }
}
