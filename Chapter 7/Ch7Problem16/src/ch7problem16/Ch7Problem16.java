/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7problem16;

import java.util.Scanner;
import myutil.MealCard;

/**
 *
 * @author Farhad
 */
public class Ch7Problem16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // Create instances of MealCard class
    
    String askPoint="";
    int chooseOption=0, chooseId=1;
            
    MealCard student1 = new MealCard();
    MealCard student2 = new MealCard();   
    



    Scanner keyboard = new Scanner(System.in);

    System.out.println("For student 1: ");
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
    
    System.out.println("For student 2: ");
    System.out.println("Name: ");
    student2.setName(keyboard.nextLine()); 
    System.out.println("Age: ");
    student2.setAge(keyboard.nextInt()); 
        keyboard.nextLine();

    System.out.println("Meal Card Balace: ");
    askPoint = keyboard.nextLine();
    if( askPoint !=null && askPoint!=""){
        student2.newBalance = Integer.parseInt(askPoint);
    }else{
        student2.newBalance = student1.DEFAULT_BALANCE;
    }
    
//    System.out.println("Current Meal Card Balace is: "+student1.newBalance);

    while(true){
        
        System.out.println("Choose student no \n\t1. Student 1\n\t2. Student 2\n\t3. Exit");
        chooseId = keyboard.nextInt();
        keyboard.nextLine();
        if(chooseId==1){
            
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
            break;
        }
        }
        }
            
        //------------
        //for student 2
        //------------
        else if(chooseId==2){
        
            while(true){
                
            
            System.out.println("\nChose options\n\t1. Buy Food item\n\t2. Purchase Point\n\t3. Check Current Balance\n\t4. Exit");
    
        chooseOption=keyboard.nextInt();
        keyboard.nextLine();
        if(chooseOption==1){
            
            System.out.println("Enter item value");
            student2.setItemValue(keyboard.nextInt());
            if(student2.newBalance-student2.getItemValue()>0){
            System.out.println("Item purchased by "+student2.getItemValue()+". Your Current balance is "+student2.purchaseItem());
            }else{
                System.out.println("Your balance is low. Please purches point.");
            }
        }else if(chooseOption==2){
            System.out.println("Enter how much point to add");
            student2.setTopUpValue(keyboard.nextInt());
            System.out.println("Now your current balance is "+student2.purchasePoints());
        }else if(chooseOption==3){
            System.out.println(student2.toString());
        }else if(chooseOption==4){
//            System.exit(0);
                break;
        }
        }
            
        }else if(chooseId==3){
            break;
        }
        else{
            System.out.println("Choose a valid option");
        }
        
        System.out.println("Choagfawe wt awose a valid option");
        
          
    }
    
 
    }
    
 

}