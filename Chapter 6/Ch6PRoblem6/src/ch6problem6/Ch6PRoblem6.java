/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6problem6;

import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class Ch6PRoblem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int startFrom, endAt, increment;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enetr start value: ");
        startFrom = sc.nextInt();
        
        System.out.println("Enetr end value: ");
        endAt = sc.nextInt();
        
        increment=startFrom;
        while(increment<=endAt){
            System.out.print(" "+increment);
            if(increment%10==9){
                System.out.print("\n");
            }
            increment++;
        }
    }
    
}
