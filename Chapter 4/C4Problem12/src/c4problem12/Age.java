/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4problem12;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Age {
        private int userAge;
    

    
    public int getUserAge(){
        return userAge;
    }
    
    public void setUserAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        userAge = sc.nextInt();
    }
    
}
