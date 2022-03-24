/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6problem17;

/**
 *
 * @author FARHAD
 */
public class Ch6Problem17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int low=100, heigh=1000,sum=0,x,y,z;
        
        
        
        for(int i=low+1;i<heigh;i++){
            
            String number = String.valueOf(i);

            String[] digits = number.split("(?<=.)");
            
            x = Integer.parseInt(digits[0]);
            y = Integer.parseInt(digits[1]);
            z = Integer.parseInt(digits[2]);

            sum = (int)Math.pow(x,3)+(int)Math.pow(y,3)+(int)Math.pow(z,3);
            
            if(i==sum){
                System.out.println(""+i);
            }
            
        }
        

    }
    

    
}
