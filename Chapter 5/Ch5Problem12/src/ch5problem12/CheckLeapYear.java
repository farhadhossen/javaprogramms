/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5problem12;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class CheckLeapYear {
    private static int year;
    private static String strResult;
    
    
    
    public void setYear(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        
    }
    
    public String resultleapyear(){
        
        if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0)){
            strResult = "leap year";
        }else{
            strResult = "not leap year";
        }
        
        return strResult;
    }
}
