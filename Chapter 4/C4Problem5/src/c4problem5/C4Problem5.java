/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4problem5;

/**
 *
 * @author Farhad
*/
import java.util.Random;

public class C4Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Die one;
        
        one = new Die( );
        
        
        for(int i=0;i<3;i++){
                   
            one.roll();
        
            System.out.println("RollDice "+(i+1)+" result: " + one.getNumber( ));
            
        }
        

    }
    
}


class Die {
    //Data Members
    //the largest number on a die
    private static final int MAX_NUMBER = 6;
    //the smallest number on a die
    private static final int MIN_NUMBER = 1;
    //To represent a die that is not yet rolled
    private static final int NO_NUMBER = 0;
    private int number;
    private Random random;

    //Constructor
    public Die() {
        random = new Random();
        number = NO_NUMBER;
    }

    //Rolls the die
    public void roll(){
        number = random.nextInt (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
       
    }
    
    //Returns the number on this die
    public int getNumber(){
    
        return number;
    }
}