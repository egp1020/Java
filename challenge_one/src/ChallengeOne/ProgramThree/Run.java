package ChallengeOne.ProgramThree;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Run.java
 * 
 * Created on July 06, 2021 5:23 AM
 */


/**
 * Método encargado de hacer la ejecución del programa
 * Es el método principal del proyecto
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */
public class Run {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option;
        boolean value = true;
        
        while (value){
            System.out.println(" -----------------------------");
            System.out.println("|           M E N U           |");
            System.out.println(" -----------------------------");
            System.out.println("[1] Y sin embargo se mueve.");
            System.out.println("[2] Descendientes.");
            System.out.println("[3] Triangulares.");
            System.out.println("[4] Tableros.");
            System.out.println("[5] Salir.");
            System.out.println(" -----------------------------");
            
            try{
                System.out.print("Ingrese la opción deseada: ");
                option = input.nextInt();
                System.out.println(" -----------------------------");
                
                switch(option){
                    case 1:
                        // Creando una instancia de FreeFallSimulator
                        FreeFallSimulator test = new FreeFallSimulator();
                        String d = test.distanceTime();
                        System.out.println(d);
                        break;
                    
                    case 2:
                        // Creando una instancia de GeneratorGenerations
                        GeneratorGenerations test1 = new GeneratorGenerations();
                        String g = test1.PeopleGeneration();
                        System.out.println(g);
                        break;
                    
                    case 3:
                        // Creando una instancia de ConstructorTriangles
                        ConstructorTriangles test2 = new ConstructorTriangles();
                        String t = test2.Triangle();
                        System.out.println(t);
                        break;
                    
                    case 4:
                        //Creando una instancia de BoardBuilder
                        BoardBuilder test3 = new BoardBuilder();
                        test3.Board();
                        break;
                    
                    case 5:
                        value=false;
                        break;
                        
                    default:
                        System.out.println("La opción no existe.");
                }
            } catch(InputMismatchException NN){ // Manejo de errores
                System.out.println("Operación no permitida, se debe ingresar un número.");
                break;
            }
        }  
    }
}
