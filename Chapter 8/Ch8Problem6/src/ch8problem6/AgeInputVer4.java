/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8problem6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class AgeInputVer4 {
    
    private static final String DEFAULT_MESSAGE = "Your age:";
    private static final int DEFAULT_LOWER_BOUND = 0;
    private static final int DEFAULT_UPPER_BOUND = 99;
    private int lowerBound;
    private int upperBound;
    private Scanner scanner;
    
    
    
    public AgeInputVer4(){
        init(DEFAULT_LOWER_BOUND, DEFAULT_UPPER_BOUND);
    }

    public AgeInputVer4(int low, int high)
    throws IllegalArgumentException {
        if (low > high) {
            throw new IllegalArgumentException(
                "Low (" + low + ") was " +
                "larger than high(" + high + ")");
        } else {
            init(low, high);
        }
    }

    public int getAge() throws Exception {
        return getAge(DEFAULT_MESSAGE);
    }

    public int getAge(String prompt) throws Exception {
    
        int age;
        while (true) {
        System.out.print(prompt);
        try {
        age = scanner.nextInt();
        
        if(age<0){
            throw new Exception("Illegal value: negative age is invalid");
        }
        
        else if (age < lowerBound || age > upperBound) {
                throw new Exception("Input out of bound");
            }
            return age; //input okay so return the value & exit
        } catch (InputMismatchException e) {
            scanner.next();
            System.out.println("Input is invalid.\n" +
                "Please enter digits only");
            }
        }
    }
    
    private void init(int low, int high) {
        lowerBound = low;
        upperBound = high;
        scanner = new Scanner(System.in);
    }
}
