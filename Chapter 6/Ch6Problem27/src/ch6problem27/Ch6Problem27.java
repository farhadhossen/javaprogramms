/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6problem27;

/**
 *
 * @author Farhad
 */

import java.lang.Math;
import static java.lang.Math.sin;
import static java.lang.Math.cos;


public class Ch6Problem27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(""+Double.MAX_VALUE);
        
        ForSinX forSinX = new ForSinX();
        cal_sin(30);
        forSinX.getSinX(30);
        
        ForCosX forCosX = new ForCosX();
        cal_cos(30);
        forCosX.getCosX(30);
        
    }
    
    
    
    static void cal_sin(double n)
{    
    double accuracy = (double) 0.0001, denominator, sinx, sinval;
     
    // Converting degrees to radian
    n = n * (double)(3.142 / 180.0);
 
    double x1 = n;
     
    // maps the sum along the series
    sinx = n;        
     
    // holds the actual value of sin(n)
    sinval = (double)sin(n);    
    int i = 1;
    do
    {
        denominator = 2 * i * (2 * i + 1);
       
        x1 = -x1 * n * n / denominator;
              

        sinx = sinx + x1;
              

        i = i + 1;
    } while (accuracy <= sinval - sinx);
       System.out.println(sinx);
}
    
    static void cal_cos(float n) {
    float accuracy = (float) 0.0001, x1, denominator, cosx, cosval;
    // Converting degrees to radian
    n = n * (float) (3.142 / 180.0);
    x1 = 1;
    // maps the sum along the series
    cosx = x1;
    // holds the actual value of sin(n)
    cosval = (float) cos(n);
    int i = 1;
    do {
        denominator = 2 * i * (2 * i - 1);
        x1 = -x1 * n * n / denominator;
        cosx = cosx + x1;
        i = i + 1;
         
    }
    while (accuracy <= cosval - cosx);
    System.out.println(cosx);
     
}
}
