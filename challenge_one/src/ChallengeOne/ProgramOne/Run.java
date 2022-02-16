package ChallengeOne.ProgramOne;
/**
 * Run.java
 * 
 * Created on July 06, 2021 3:56 AM
 */


/**
 * Método encargado de hacer la ejecución del programa
 * Es el método principal del proyecto
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */

public class Run {
    public static void main(String[] args) {
        
        // Solicitando información personales e imprimiendo esa información
        PersonalInformation persona = new PersonalInformation();
        persona.printInformation(); 
        
        // Se hace una instancia para imprimir un robot y un nombre.
        StarWars objeto = new StarWars();
        objeto.printRobot();
        objeto.printName();
    }
}
