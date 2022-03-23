/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6problem27;

/**
 *
 * @author Farhad
 */

import java.lang.Math;
import static java.lang.Math.sin;

public class ForSinX {
    double carryfct=1;
        

    
    public void getSinX(double x){
        
         // Converting degrees to radian
         x = x * (double)(3.142 / 180.0);
         
         //variable dec
        double sinx=x,i=3, x1=x,div;
        
        //get sin value using math function
        double sinval = (double)sin(x);
        
        //fix a accuracy for check overflow
        double accuracy = (double) 0.0001;
        
        do{
            
            carryfct = carryfct * (i-1)*i;

            x1= -(x1*x*x);

            
            div = x1/carryfct;
            
            
            sinx = sinx + div;

            
            i=i+2;
  

        }while(accuracy <= sinval - sinx);
        
        System.out.println("finally= "+sinx);

       
    }
}
