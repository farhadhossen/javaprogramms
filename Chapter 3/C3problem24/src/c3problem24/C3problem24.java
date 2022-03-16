/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3problem24;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class C3problem24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int totalBag;
        Double WeightPerBag,PricePerpound, SalesText, totalPrice, totalPriceWithText;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of bags sold:   ");
        totalBag = sc.nextInt();
        System.out.print("     Weight per bag:   ");
        WeightPerBag = sc.nextDouble();
        System.out.println("    Price per pound:  $5.99");
        System.out.print("          Sales tax:  7.25%");
 
        totalPrice = WeightPerBag * totalBag * 5.99;
        totalPriceWithText = totalPrice + totalPrice * 0.0725;
        
        System.out.println("\n        Total price:  $ "+totalPriceWithText);
        
    }
    
}
