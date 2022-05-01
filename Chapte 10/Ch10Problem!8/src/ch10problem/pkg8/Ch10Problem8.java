/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10problem.pkg8;

import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class Ch10Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Fortune fortune = new Fortune();
        
        while(true){
            System.out.print("Fortune (y/N)?");
            
            if(sc.nextLine().equalsIgnoreCase("n"))
                break;
            
            
            fortune.getFortune();
        }
    }
    
}
