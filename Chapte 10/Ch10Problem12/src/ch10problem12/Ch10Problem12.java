/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10problem12;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FARHAD
 */
public class Ch10Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Double> data = new ArrayList<>();

        String temp;

        
        
        Scanner sc = new Scanner(System.in);
        

    
    System.out.print("Enter elements: ");
    
    while(true){
        
        temp = sc.nextLine();
        
        
        if(temp.isBlank() || temp.isEmpty()){
            break;
        }else
            data.add(Double.parseDouble(temp));

    }
    

    System.out.println("\nStandard Deviation = "+ calculateSD(data));
        
    }
    
    
    static double calculateSD(List<Double> data) {
    double sum = 0.0, mean, SD = 0.0;
    int lengthOfList = data.size();
    
    for(Double datum: data){
        sum = sum + datum;
    }
    

    mean = sum / lengthOfList;
    
    for(Double datum: data){
        SD += pow(datum - mean, 2);
    }
    

    return sqrt(SD / lengthOfList);
}
    
}