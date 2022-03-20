/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5problem9;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class WordForNumber {
    
    String wordString;
    int your_number;
    
    public String getWordForNumber(){
        
        switch (your_number){
            
            case 6: wordString = "Million";
                    break;
            case 9: wordString = "Billion";
                    break;
            case 12: wordString = "Trillion";
                    break;
            case 15: wordString = "Quadrillion";
                    break;
            case 18: wordString = "Quintillion";
                    break;
            case 21: wordString = "Sextillion";
                    break;
            case 30: wordString = "Nonillion";
                    break;
            case 100: wordString = "Googol";
                    break;
            
                    
            default: wordString = "No corresponding word  found for the number. Please insert a appropriate number";
                    break;
            
        }
        
        return wordString;
    }
    
    public void setWordForNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an appropriate number: ");
        your_number = sc.nextInt();
    }
}
