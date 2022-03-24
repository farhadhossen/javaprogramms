/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6problem24;

import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class Ch6Problem24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=0, intLen;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = sc.nextInt();
        
        intLen = String.valueOf(x).length();
        

        
        for(int i=intLen; i<(5*3+intLen); i+=3){
            System.out.format("%" + (i) + "d", x);
            System.out.format("%" + (5*3+intLen-i) + "d", x);
        }

    }
    
}
