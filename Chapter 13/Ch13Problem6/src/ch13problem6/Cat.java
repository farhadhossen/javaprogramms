/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13problem6;

/**
 *
 * @author FARHAD
 */
public class Cat extends Pet{
    
    private String name;
    
    private String coatColor;

    @Override
    public String getName( ) {

        return name;

    }

    @Override
    public void setName(String petName) {

        name = petName;

    }
    
    
    public String getcoatColor( ) {

        return coatColor;

    }

    
    public void setcoatColor(String petcoatColor) {

        coatColor = petcoatColor;

    }
}
