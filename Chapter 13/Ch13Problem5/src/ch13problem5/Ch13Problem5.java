/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class Ch13Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Pet> petList = new ArrayList<>();
        Pet pet;
        String name, type;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter pet name: ");
            name = sc.nextLine();
            
            if(name.equalsIgnoreCase("stop")){
                break;
            }
            
            System.out.print("Enter pet type ( c for cat and d for dog ): ");
            type = sc.nextLine();
            
            if(type.equalsIgnoreCase("c")){
                pet = new Cat();
                pet.setName(name);
                petList.add(pet);
            }
            else if(type.equalsIgnoreCase("d")){
                pet = new Dog();
                pet.setName(name);
                petList.add(pet);
            }
        }
        
        for(Pet petL : petList){
            
            if(petL instanceof Cat){
                System.out.println(petL.getName() +" Cat");
                    
            }
        }
        for(Pet petL : petList){
            
            if(petL instanceof Dog){
                System.out.println(petL.getName() +" Dog");
                    
            }
        }
        
    }
    
}
