/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6problem7;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Ch6Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int inputNumber = 1;
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter a number: ");
            inputNumber = sc.nextInt();
            
            if(inputNumber>0){
                if(isPrime(inputNumber))
                    System.out.println(inputNumber+" is prime");
                else
                    System.out.println(inputNumber+" is not prime");
            }else{
                break;
            }
            
            
        }
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
