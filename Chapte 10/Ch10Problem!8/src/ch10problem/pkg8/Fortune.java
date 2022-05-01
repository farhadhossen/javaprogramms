/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10problem.pkg8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FARHAD
 */
public class Fortune {
    
    List<String> fortuneList;
    
    Fortune(){
        fortuneList = new ArrayList<>();
        fortuneList.add("You will qet 4.0 GPA this semester.");
        fortuneList.add("Happiness is programming.");
        fortuneList.add("Satisfaction follows hard work.");
        fortuneList.add("Patience is virtue.");
        fortuneList.add("Exam is comming");
        fortuneList.add("You will qet 3.0 GPA this semester.");
        fortuneList.add("You will qet 2.0 GPA this semester.");
        fortuneList.add("You will qet 1.0 GPA this semester.");
        fortuneList.add("You will qet 0.0 GPA this semester.");
        fortuneList.add("Your copmuter will be hack soon");
    }
    
    public void getFortune(){
        
        
        int b = (int)(Math.random()*(9-0+1)+0);  
        
        System.out.println(fortuneList.get(b));
    }
    
}
