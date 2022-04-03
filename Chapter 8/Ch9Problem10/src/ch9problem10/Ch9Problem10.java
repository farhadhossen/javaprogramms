/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9problem10;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Ch9Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        String str;
        
        while(true){
            
        System.out.println("Enter a sentence: ");
        str = sc.nextLine();
        
        if(str.isEmpty() || str.isBlank()){
            break;
        }
        
        StringBuffer sbf = new StringBuffer();
        
        sbf = sbf.append(str);
        
        
        System.out.println("Reverse sentence: "+sbf.reverse());
        
        sbf.delete(0, sbf.length());
        
        }
    } 
}
