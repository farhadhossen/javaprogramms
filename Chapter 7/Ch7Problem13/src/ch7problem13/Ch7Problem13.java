/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7problem13;

import java.util.Scanner;
import myutil.Person;

/**
 *
 * @author FARHAD
 */
public class Ch7Problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        Person person = new Person();
        
        System.out.print("Enter a name : ");
        person.setName(sc.nextLine());
        
        System.out.println("You entered \""+person.getName()+"\" as a name");
        
        
    }
    
}
