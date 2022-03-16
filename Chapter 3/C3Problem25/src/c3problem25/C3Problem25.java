/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3problem25;

import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author Farhad
 */
public class C3Problem25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        int aYear, aPopulation, bYear, bPopulation, cYear, cPopulation;

        double k;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a census year: ");
        aYear = sc.nextInt();

        
        System.out.print("Enter the population of the "+aYear+":  ");
        aPopulation = sc.nextInt();
        
        System.out.print("Enter the next census year after "+aYear+":  ");
        bYear = sc.nextInt();
        
        System.out.print("Enter the population of the "+bYear+":  ");
        bPopulation = sc.nextInt();
        
        System.out.print("Enter the next year after "+aYear+" you want to predict the population:  ");
        cYear = sc.nextInt();
        
        k = (double)(1/(double)(bYear-aYear))*Math.log(bPopulation/aPopulation);
        
        
        cPopulation = (int)(aPopulation * Math.exp(k*(cYear-aYear)));
        
        

        System.out.println("Approximate Population in "+cYear+": "+cPopulation);
        

        System.exit(0);
    }
    
}
