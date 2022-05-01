/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9problem24;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Ch9Problem24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str, tempstr="",tempstr2="";
        char letter;
        Scanner sc = new Scanner(System.in);
        
        StringBuilder input = new StringBuilder();
        
        while(true){
            
            System.out.println("Enter your sentance: ");
            
            str = sc.nextLine();
            
            if(str.isEmpty())
                break;
            else if(str.isBlank())
                continue;
            

            tempstr = str.toLowerCase();
        
            for(int i = 0; i<str.length();i++){
                letter = tempstr.charAt(i);
            
                if(letter>='a' && letter <='z'){
                    tempstr2=tempstr2+letter;
                }
            }
            
            input.append(tempstr2);

            if(tempstr2.equals(input.reverse().toString())){
                System.out.println("The sentance is palindrome");
            }else{
                System.out.println("The sentance is not palindrome");
            }  
            
            input.delete(0, input.length());
            tempstr="";
            tempstr2="";
        }       
    }   
}

//A man, a plan, a canal, Panama


