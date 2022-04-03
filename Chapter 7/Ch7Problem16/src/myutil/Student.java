/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myutil;

/**
 *
 * @author Farhad
 */
package myutil;

/**
 *
 * @author FARHAD
 */

public class Student {

    // Instance Variables
    private String name;
    private int age;
    

    // Default Constructor
    public Student() {
        this("Not Given", 0);
    }

    // Parameterized constructor that takes in values
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    


    // toString() to be overriden
    @Override
    public String toString() {
        return "\nName: " + this.name + "\n" + "Age: " + this.age +"";
    }
}