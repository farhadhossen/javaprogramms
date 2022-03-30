/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7problem14;

import java.util.Scanner;
import myutil.Person;

/**
 *
 * @author FARHAD
 */
public class Ch7Problem14 {

    /**
     * @param args the command line arguments
     */
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        Person person = new Person();
        
        //--------------------------------------
        //checking constructor
        //--------------------------------------
        System.out.println("Stored name in person is: "+person.getName());
        
        
        //--------------------------------------
        //calling mathods of person class
        //setName and getName
        //--------------------------------------
        System.out.print("Enter a name : ");
        person.setName(sc.nextLine());
        
        System.out.println("You entered \""+person.getName()+"\" as a name");
        
        
    }
    
}
