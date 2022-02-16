package ChallengeOne.ProgramThree;

import java.util.Scanner;

/**
 * Esta clase se encarga de calcular la cantidad de personas
 * que hay por generación y hace la cuenta de cuántas personas
 * son en total.
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */
public class GeneratorGenerations {
    
    // Atributos
    private int generation, totalPeople, numGeneration, peopleGeneration;
    private String text;
    private Scanner input;
    
    // Método constructor
    public GeneratorGenerations(){
        input = new Scanner(System.in);
        System.out.print("Ingrese la generación: ");
        generation = input.nextInt();
    }
    
    /**
     * 
     * Método donde se hacen los cálculos correspondientes.
     * @return El texto con la cantidad de personas que hay por generación, y 
     * a su vez, con la cantidad de personas que hay hasta le generación
     * dada.
     */
    public String PeopleGeneration(){
        totalPeople = 0;
        numGeneration = generation;
        
        while ((numGeneration >= 0) && (numGeneration <= generation)){
            peopleGeneration = (int) Math.pow(2,numGeneration);
            totalPeople += peopleGeneration;
            text += "En la generación "+numGeneration+" hay "+peopleGeneration+" personas.\n";
            numGeneration --;       
        }
        
        text += "El número de personas son: "+totalPeople;
        return text;
    } 
    
}
