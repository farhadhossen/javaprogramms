/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3problem16;

import java.util.*;

/**
 *
 * @author Farhad
 */
public class C3problem16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double iWeight, oMercury, oVenus, oJupiter, oSaturn;
        
        double sMercury = 0.4, sVenus = 0.9, sJupiter = 2.5, sSaturn = 1.1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your weight on Earth: ");
        
        iWeight = sc.nextDouble();
        
        oMercury = iWeight*sMercury;
        oVenus = iWeight*sVenus;
        oJupiter = iWeight*sJupiter;
        oSaturn = iWeight*sSaturn;
        
        
        System.out.println("Your Weight in: ");
        System.out.println("Planet          Weight");
        System.out.println("------------------------");
        System.out.println("Mercury          "+oMercury);
        System.out.println("Venus            "+oVenus);
        System.out.println("Jupiter          "+oJupiter);
        System.out.println("Saturn           "+oSaturn);
    }
    
}
