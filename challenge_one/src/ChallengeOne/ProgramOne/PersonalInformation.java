package ChallengeOne.ProgramOne;
import java.util.Scanner;

/**
 * Clase contiene los atributos y métodos para solicitar 
 * e imprimir información de una persona.
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */
public class PersonalInformation {
    
    // Atributos
    private String name, surname, address, neighborhood, city, phoneNumber;
    private Scanner input;
    
    // Método constructor
    public PersonalInformation(){
        input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        name = input.nextLine();
        System.out.print("Ingrese su apellido: ");
        surname = input.nextLine();
        System.out.print("Ingrese su número de télefono: ");
        phoneNumber = input.nextLine();
        System.out.print("Ingrese su dirección: ");
        address = input.nextLine();
        System.out.print("Ingrese el nombre de la ciudad donde vive: ");
        city = input.nextLine();
        System.out.print("Ingrese el nombre del barrio donde vive: ");
        neighborhood = input.nextLine();
    }
    
    // Método para imprimir la información solicitada
    public void printInformation(){
        if (phoneNumber.matches("[0-9]*")){
            System.out.println(" ---------------------------------------------");
            System.out.println("|      Mostrando la infomación ingresada      |");
            System.out.println(" ---------------------------------------------");
            System.out.println("El nombre completo es "+name+' '+surname);
            System.out.println("El número telefónico es "+phoneNumber);
            System.out.println("La dirección de su vivienda es "+address);
            System.out.println("La ciudad donde vive es "+city);
            System.out.println("El barrio donde vive es "+neighborhood);
        } else{
            System.out.print("El número de telefono ingresado es incorrecto.");
        }
        
    }
}
