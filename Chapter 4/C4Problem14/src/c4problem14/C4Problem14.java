/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4problem14;

/**
 *
 * @author Farhad
 */
public class C4Problem14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EarthWeight earthWeight = new EarthWeight();
        earthWeight.setEarthWeight();
        
        
        WeightConverter  mercuryWeight, venusWeight, jupiterWeight, saturnWeight;
        
        
        mercuryWeight = new WeightConverter(0.4);
        venusWeight = new WeightConverter(0.9);
        jupiterWeight = new WeightConverter(0.25);
        saturnWeight = new WeightConverter(1.1);
        
        
        System.out.println("Your Weight on");
        System.out.println("Planet                 Weight");
        System.out.println("-----------------------------");
        
        
        System.out.println("Mercury                 "+mercuryWeight.convert(earthWeight.getEarthWeight()));
        System.out.println("Venus                   "+venusWeight.convert(earthWeight.getEarthWeight()));
        System.out.println("Jupiter                 "+jupiterWeight.convert(earthWeight.getEarthWeight()));
        System.out.println("Saturn                  "+saturnWeight.convert(earthWeight.getEarthWeight()));
        

        
    }
    
}
