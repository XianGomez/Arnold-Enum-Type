package edu.teamrocket;

import edu.teamrocket.logica.Planeta;

public class ArnoldMain {
	
	public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Uso: java ArnoldMain <peso_en_kg>");
            return;
        }

        double peso = Double.parseDouble(args[0]);
        
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
    }

}