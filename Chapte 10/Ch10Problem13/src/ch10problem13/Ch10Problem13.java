/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10problem13;

/**
 *
 * @author FARHAD
 */
public class Ch10Problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[][] payScaleTable = { 
                { 10.50, 12.00, 14.50, 16.75, 18.00 },
                { 20.50, 22.25, 24.00, 26.25, 28.00 },
                { 34.00, 36.50, 38.00, 40.35, 43.00 },
                { 50.00, 60.00, 70.00, 80.00, 99.99 } };

        // Find the average pay of level 2 employees
        for (int i = 0; i<4; i++){
            
        
        double sum = 0.0, average;
        for (int j = 0; j < 5; j++) {
            sum += payScaleTable[i][j];
        }
        average = sum / 5;
        System.out.println(" Average of Level "+ (i+1) + " Employees: " + average);
        
        }
        System.out.println("\n");
        
        //The average pay for every step (i.e., average of every column)
        
        for (int i = 0; i<5; i++){
            
        
        double sum = 0.0, average;
        for (int j = 0; j < 4; j++) {
            sum += payScaleTable[j][i];
        }
        average = sum / 4;
        System.out.println(" Average of step "+ (i+1) + " Employees: " + average);
        
        }
        

    }
}
