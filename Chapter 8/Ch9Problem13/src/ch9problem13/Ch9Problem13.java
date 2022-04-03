/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9problem13;

import java.util.Scanner;


/**
 *
 * @author Farhad
 */
public class Ch9Problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str;
        char letter;
        int count;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            count=0;
            System.out.println("Enter your string: ");
            
            str = sc.nextLine();
            
            if(str.isEmpty())
                break;
            else if(str.isBlank())
                continue;
            
            System.out.println("Number of uppercase latter in the string");
            System.out.println("\t\t\""+str+"\"");
        
            for(int i = 0; i<str.length();i++){
                letter = str.charAt(i);
            
                if(Character.isUpperCase(letter)){
                    count++;
                }
            }
            
            System.out.println("Total number of uppercase letter is : " +count);
        
        }
        
    }
    
}


