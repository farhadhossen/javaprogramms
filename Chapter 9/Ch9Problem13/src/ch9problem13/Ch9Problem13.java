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
        
        String string;
        char ltr;
        int c=0;
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Enter your string: ");
            
            string = scanner.nextLine();
            
            if(string.isEmpty())
                break;
            else if(string.isBlank())
                continue;
            
            System.out.println("Number of uppercase latter in the string");
            System.out.println("\t\t\""+string+"\"");
        
            for(int i = 0; i<string.length();i++){
                ltr = string.charAt(i);
            
                if(Character.isUpperCase(ltr)){
                    c++;
                }
            }
            
            System.out.println("Total number of uppercase letter is : " +c);
            c=0;
        
        }
        
    }
    
}


