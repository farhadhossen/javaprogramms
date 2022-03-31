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
    
    String askPoint="";
    int chooseOption=0;
            
    MealCard student1 = new MealCard();

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Name: ");
    student1.setName(keyboard.nextLine()); 
    System.out.println("Age: ");
    student1.setAge(keyboard.nextInt()); 
        keyboard.nextLine();

    System.out.println("Meal Card Balace: ");
    askPoint = keyboard.nextLine();
    if( askPoint !=null && askPoint!=""){
        student1.newBalance = Integer.parseInt(askPoint);
    }else{
        student1.newBalance = student1.DEFAULT_BALANCE;
    }
    
//    System.out.println("Current Meal Card Balace is: "+student1.newBalance);

    while(true){
        
        System.out.println("\nChose options\n\t1. Buy Food item\n\t2. Purchase Point\n\t3. Check Current Balance\n\t4. Exit");
    
        chooseOption=keyboard.nextInt();
        keyboard.nextLine();
        if(chooseOption==1){
            
            System.out.println("Enter item value");
            student1.setItemValue(keyboard.nextInt());
            if(student1.newBalance-student1.getItemValue()>0){
            System.out.println("Item purchased by "+student1.getItemValue()+". Your Current balance is "+student1.purchaseItem());
            }else{
                System.out.println("Your balance is low. Please purches point.");
            }
        }else if(chooseOption==2){
            System.out.println("Enter how much point to add");
            student1.setTopUpValue(keyboard.nextInt());
            System.out.println("Now your current balance is "+student1.purchasePoints());
        }else if(chooseOption==3){
            System.out.println(student1.toString());
        }else if(chooseOption==4){
            System.exit(0);
        }
    }
    
    
   
    }
    
    

    
}
