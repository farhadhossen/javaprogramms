/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13problem12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class Ch13Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Pet> petList = new ArrayList<>();
        List<Dog> petDogList = new ArrayList<>();
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
                
                System.out.print("Enter pet coat color : ");
                ((Cat)pet).setcoatColor(sc.nextLine());
                petList.add(pet);
            }
            else if(type.equalsIgnoreCase("d")){
                pet = new Dog();
                pet.setName(name);
                System.out.print("Enter pet weight : ");
                ((Dog)pet).setweight(sc.nextDouble());
                petList.add(pet);
                sc.nextLine();
            }
        }
        
        for(Pet petL : petList){
            
            if(petL instanceof Cat){
                    System.out.println(petL.getName()+" Cat "+((Cat)petL).getcoatColor());
            }else if(petL instanceof Dog){
                System.out.println(petL.getName()+" Dog "+((Dog)petL).getweight());
                petDogList.add((Dog)petL);
            }
        }
        
        double minW, maxW, tempW, totalW=0.0, avgW;
        minW = maxW =petDogList.get(0).getweight();
        
        for(int i=0;i<petDogList.size();i++){
            
            tempW = petDogList.get(i).getweight();
            if(minW>tempW)
                minW = maxW;
            
            if(maxW<tempW)
                maxW = tempW;
            
            totalW = totalW+tempW;
            
        }
        
        avgW = totalW/petDogList.size();
        
        System.out.println("\n");
        System.out.println("Minimum dog weight: "+minW);
        System.out.println("Maximum dog weight: "+maxW);
        System.out.println("Avg dog weight: "+avgW);
        
    }
    
}
