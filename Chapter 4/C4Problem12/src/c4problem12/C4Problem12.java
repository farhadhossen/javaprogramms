/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4problem12;

/**
 *
 * @author Farhad
 */
public class C4Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age age = new Age();
        age.setUserAge();
        
        Height height = new Height();
        height.setUserHeight();
        
        
       Weight weight = new Weight(height.getUserHeight(),age.getUserAge());
       
       System.out.println("Your recommended weight is : "+weight.getrecommendedWeight());
    }
    
}
