/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3problem27;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;



/**
 *
 * @author Farhad
 */
public class C3Problem27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long caculatedbday;
        String strbirthday;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");    
        LocalDate birthday, today;
        today = LocalDate.now();

        
        
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter your birthday as MM/DD/YYYY format: ");
        strbirthday = sc.next();
        birthday = LocalDate.parse(strbirthday, formatter);

        
        caculatedbday = ChronoUnit.DAYS.between(birthday, today);
        
        System.out.println("Today you are "+caculatedbday+"  days old");
        
    }
    
}
