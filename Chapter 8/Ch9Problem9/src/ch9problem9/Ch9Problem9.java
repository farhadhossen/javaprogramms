/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9pro9;

import java.util.Scanner;


public class Ch9Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        String inputString;
        char firstChar;
        
        
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Character: ");
            inputString = scanner.nextLine();
            
            if(inputString==null){
                System.out.println("Enter a character");
                continue;
            }else if(inputString.length()>1){
                System.out.println("Input only one character");
                continue;
            }else if(inputString.equals("@")){
                break;  
            }
            else{
                firstChar = inputString.charAt(0);
        
                System.out.println("ASCII value is "+((int)firstChar));
            }
                
        }
        
        
    }
    
}
