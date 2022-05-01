/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9problem11;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */
public class Ch9Problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        String str;
        char letter;
        int count_a=0, count_e=0,count_i=0,count_o=0,count_u=0;
        
        
        while(true){
        System.out.println("Enter a sentence");
        
        str = sc.nextLine();
        
        if(str.isEmpty())
            break;
        else if(str.isBlank())
            continue;
        
        System.out.println("Vowel counts for the sentence");
        System.out.println("\t\t"+str);
        
        for(int i = 0; i<str.length();i++){
            letter = str.charAt(i);
            
            
            switch(letter){
                case 'a':
                    count_a++;
                    break;
                case 'e':
                    count_e++;
                    break;
                case 'i':
                    count_i++;
                    break;
                case 'o':
                    count_o++;
                    break;
                case 'u':
                    count_u++;
                    break;
            }

        }
        
        System.out.println("# of \'a\' : "+count_a);
        System.out.println("# of \'e\' : "+count_e);
        System.out.println("# of \'i\' : "+count_i);
        System.out.println("# of \'o\' : "+count_o);
        System.out.println("# of \'u\' : "+count_u); 
        count_a=0;
        count_e=0;
        count_i=0;
        count_o=0;
        count_u=0;
        }      
    } 
}
