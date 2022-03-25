/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5problem17;

/**
 *
 * @author Farhad
 */
import java.lang.Math;
import java.util.Scanner;
public class Ch5Problem17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        
        IntegerToRoman intToRoman = new IntegerToRoman();
        
        intToRoman.integerToRoman(year);
        
    }
    
}
