package edu.teamrocket;

import edu.teamrocket.logica.Planeta;

public class ArnoldMain {
	
	public static void main(String[] args) {

        double peso = 1.0;
        
        if (args.length == 2) {
            try {
                peso = Double.parseDouble(args[0]);
                Planeta planeta = Planeta.valueOf(args[1].toUpperCase());
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
                return;
            } catch (IllegalArgumentException e) {
                System.out.println("Check your parameters, it must be an integer and a valid planet name");
            }
            

        } else {

            for(Planeta planeta : Planeta.values()){
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }
            
            System.out.println("\nYour weight only on the terrestrial planets: ");
            for(Planeta planeta: Planeta.getPlanetasTerrestres()){
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }
            
            System.out.println("\nYour weight only on the gas giant planets: ");
            for(Planeta planeta: Planeta.getGigantesGaseosos()){
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }

            System.out.println("\nYour weight only on the frozen planets: ");
            for(Planeta planeta : Planeta.getPlanetasHelados()){
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }
        }
        
        
    }

}