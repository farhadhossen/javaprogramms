/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10problem11;

/**
 *
 * @author FARHAD
 */


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ch10Problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, n;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total number of input N: ");
        n= sc.nextInt();
        double[] data = new double[n];
    
    System.out.print("Enter 10 elements: ");
    for (i = 0; i < 10; ++i)
        data[i] = sc.nextDouble();

    System.out.println("\nStandard Deviation = "+ calculateSD(data,n));
        
    }
    
    
    static double calculateSD(double data[], int n) {
    double sum = 0.0, mean, SD = 0.0;
    int i;
    for (i = 0; i < n; ++i) {
        sum += data[i];
    }
    mean = sum / n;
    for (i = 0; i < n; ++i) {
        SD += pow(data[i] - mean, 2);
    }
    return sqrt(SD / n);
}
    
}
