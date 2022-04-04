/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9problem22;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Ch9Problem22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentance: ");
        String str = sc.nextLine();
        
        StringBuffer sf = new StringBuffer();
        StringBuffer sf2 = new StringBuffer();
        char letter;
        
        for(int i = 0; i<str.length();i++){
            letter = str.charAt(i);
            if((letter>='a' && letter<='z') || (letter>='A' && letter<='Z')){
                sf.append(letter);
            }else{
                sf.reverse();
                sf2.append(sf);
                sf.delete(0, i);
                sf2.append(letter);
            }
        }
        
        System.out.println("Output sentance is: \n"+sf2.toString());
        
        //Hello, how are you? I use JDK 1.2.2. Bye-bye.

    }
    
}
