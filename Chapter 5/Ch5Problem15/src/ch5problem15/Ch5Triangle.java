/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5problem15;

/**
 *
 * @author Farhad
 */
public class Ch5Triangle {
    
   
    private boolean isValid;
    private static double a, b, c, s, area, perimeter; 
    
    public Ch5Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        checkValid();
    }
    
    public void checkValid(){
        if(a>0 && b>0 && c>0){
            isValid = true;
        }else{
            isValid = false;
        }
    }
    
    public double getPerimeter(){
        
        if(isValid){
            perimeter = a+b+c;
        }else{
            perimeter = -1;
        }
        
        
        return perimeter;
    }
    
    public double getArea(){
        
        
        if(isValid){
            s = (a+b+c)/2;
            area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        }else{
            area =-1;
        }
        
        
        
        return area;
    }
        
    
}
