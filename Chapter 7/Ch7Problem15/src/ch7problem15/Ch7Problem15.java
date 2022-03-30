/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7problem15;

import java.util.Scanner;
import myutil.MealCard;

/**
 *
 * @author FARHAD
 */
public class Ch7Problem15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // Create instances of MealCard class
    MealCard student1 = new MealCard();

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Name: ");
    student1.setName(keyboard.nextLine()); 
    System.out.println("Age: ");
    student1.setAge(keyboard.nextInt()); 
    System.out.println("Address: ");
    student1.setAddress(keyboard.nextLine()); 
    System.out.println("Meal Card Balace: ");
    student1.newBalance = keyboard.nextInt();
    System.out.println("Number of Meal Cards Issued: ");
//    student1.numberOfMealCards = keyboard.nextInt();

    System.out.println("Name: ");
    student2.setName(keyboard.nextLine()); 
    System.out.println("Age: ");
    student2.setAge(keyboard.nextInt()); 
    System.out.println("Address: ");
    student2.setAddress(keyboard.nextLine()); 
    System.out.println("Meal Card Balace: ");
    student2.newBalance = keyboard.nextInt();
    System.out.println("Number of Meal Cards Issued: ");
//    student2.numberOfMealCards = keyboard.nextInt();

    // Call purchaseItem
    student1.purchaseItem();


    // Call purchasePoints
    student2.purchasePoints();

    // Call tString to output information to user
    }
    
}
