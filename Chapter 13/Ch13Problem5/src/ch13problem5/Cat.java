/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13problem5;

/**
 *
 * @author FARHAD
 */
public class Cat extends Pet{
    
    private String name;

    @Override
    public String getName( ) {

        return name;

    }

    @Override
    public void setName(String petName) {

        name = petName;

    }
}
