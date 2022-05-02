/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13problem12;

/**
 *
 * @author FARHAD
 */
public class Dog extends Pet{
    
    private String name;
    
    private double weight;

    @Override
    public String getName( ) {

        return name;

    }

    @Override
    public void setName(String petName) {

        name = petName;

    }
    
   
    public double getweight( ) {

        return weight;

    }

   
    public void setweight(double petweight) {

        weight = petweight;

    }
}
