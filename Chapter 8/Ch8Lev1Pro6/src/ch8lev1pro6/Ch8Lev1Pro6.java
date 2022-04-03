/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8lev1pro6;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Ch8Lev1Pro6 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        int age;

        System.out.println("Enter your age: ");

        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        Ch8Lev1Pro6.checkAgeValidity(age);

    }

    static void checkAgeValidity(int age) {

        if (age < 0) {

            throw new ArithmeticException("Illegal value: negative age is invalid");

        } else {

            System.out.println("It is a valid age");

        }

    }

}
