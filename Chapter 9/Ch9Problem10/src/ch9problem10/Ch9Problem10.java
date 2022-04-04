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
        
        Scanner scanner = new Scanner(System.in);
        String mystring;
        
        while(true){
            
        System.out.println("sentence: ");
        mystring = scanner.nextLine();
        
        if(mystring.isEmpty()){
            break;
        }
        
        StringBuffer stringBuffer = new StringBuffer();
        
        stringBuffer = stringBuffer.append(mystring);
        
        
        System.out.println("Reverse : "+stringBuffer.reverse());
        
        stringBuffer.delete(0, stringBuffer.length());
        
        }
    } 
}
