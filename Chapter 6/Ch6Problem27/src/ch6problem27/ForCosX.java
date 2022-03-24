/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6problem27;

import static java.lang.Math.cos;

/**
 *
 * @author Farhad
 */
public class ForCosX {
    
double carryfct=1;
        

    
    public void getCosX(double x){
        
         // Converting degrees to radian
         x = x * (double)(3.142 / 180.0);
         
         //variable dec
        double cosx=1,i=2, x1=1,div;
        
        //get cos value using math function
        double cosval = (double)cos(x);
        
        //fix a accuracy for check overflow
        double accuracy = (double) 0.0001;
        
        do{
            
            carryfct = carryfct * (i-1)*i;
 
            x1= -(x1*x*x);
    
            div = x1/carryfct;
    
            cosx = cosx + div;
            
            i=i+2;

        }while(accuracy <= cosval - cosx);
        
        
        
        System.out.println("CosX value from serise: "+cosx);
        System.out.println("CosX value from java math class= "+Math.cos(x));

  
       
    }
}
