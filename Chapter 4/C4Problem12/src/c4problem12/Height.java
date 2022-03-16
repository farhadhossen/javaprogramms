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
public class Height {
    private int userHeight;
    

    
    public int getUserHeight(){
        return userHeight;
    }
    
    public void setUserHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height (cm): ");
        userHeight = sc.nextInt();
    }
}
