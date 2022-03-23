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
        double cosx=1,i=2, x1=x,div;
        
        //get sin value using math function
        double cosval = (double)cos(x);
        
        //fix a accuracy for check overflow
        double accuracy = (double) 0.0001;
        
        do{
            
            carryfct = carryfct * (i-1)*i;
            //System.out.println(carryfct);
            
            x1= -(x1*x*x);
           // System.out.println(x1);
            
            div = x1/carryfct;
            
            
            cosx = cosx + div;
            //System.out.println(cosx);
            
            i=i+2;
            
           // System.out.println(cosx);
            
           
         
        }while(accuracy <= cosval - cosx);
        
        System.out.println("finally= "+cosx);

       
    }
}
