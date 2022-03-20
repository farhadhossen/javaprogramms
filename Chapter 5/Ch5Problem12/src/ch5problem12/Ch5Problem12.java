/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5problem12;

/**
 *
 * @author Farhad
 */
public class Ch5Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CheckLeapYear checkLeapYear = new CheckLeapYear();
        
        checkLeapYear.setYear();
        
       System.out.println("The year is "+checkLeapYear.resultleapyear());
    }
    
}
