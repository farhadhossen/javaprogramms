/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13problem7;

import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class AddStudents {

    private static final int DEFAULT_SIZE = 25;

    Student[] roster;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    AddStudents() {
        roster = new Student[DEFAULT_SIZE];
    }

    public void addstudent() {

        while (true) {

           
            
            if (count == roster.length) {
                expand();
            }

            System.out.println("Enter Student name: ");
            roster[count] = new Student(sc.nextLine());

            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter test number " + i + " score: ");
                roster[count].setTestScore(i, sc.nextInt());
            }
            
            sc.nextLine();

            roster[count].computeCourseGrade();
            System.out.print("Obtain grade: " + roster[count].getCourseGrade());

            count++;
        }

        // setTestScore
    }

    private void expand() {
        // create a new array whose size is 150% of
        // the current array
        
        
        
        int newLength = (int) (0.5 * roster.length);
        Student[] temp = new Student[newLength];
        // now copy the data to the new array
        for (int i = 0; i < roster.length; i++) {
            temp[i] = roster[i];
        }
        
        roster = temp;
    }

}
