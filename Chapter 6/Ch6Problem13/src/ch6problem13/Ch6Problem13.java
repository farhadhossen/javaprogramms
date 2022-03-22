/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6problem13;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Ch6Problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N, count=0, currentValue;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter N where N>2");
        
        while(true){
            N = sc.nextInt();
            if(N>2)
                break;
            else
                System.out.println("Please enter number that greater then 2");
        }
        
        Date startTime = new Date();
        for(currentValue=2;currentValue<=N;currentValue++){
            if(isPrime(currentValue)){
                count++;
            }
        }
        Date endTime = new Date();
        
        System.out.println("Total prime number: "+count);
        
        long elapsedTimeInMiliseconds = (long)(endTime.getTime() - startTime.getTime());
        System.out.println("Required time : "+elapsedTimeInMiliseconds+" miliseconds");
        
        
    }
    
        private static boolean isPrime(int num){
        
        
        for (int i = 2; i <= num / 2; ++i) {
        // condition for nonprime number
            if (num % i == 0) {
            return false;
            }
        }
        
        return true;
    }
    
}
