package ChallengeOne.ProgramTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Run.java
 * 
 * Created on July 06, 2021 2:10 AM
 */


/**
 * Método encargado de hacer la ejecución del programa
 * Es el método principal del proyecto
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */

public class Run {
    
    public static void main(String[] arg){
        
        Scanner input = new Scanner(System.in);
        int option;
        boolean value = true;
        
        
        // Menú de opciones para elegir la conversión de los espacios de colores
        while (value){
            System.out.println(" -----------------------------");
            System.out.println("|           M E N U           |");
            System.out.println(" -----------------------------");
            System.out.println("1. Convertir de YIQ a rva");
            System.out.println("2. Convertir de YIQ a YCbCr");
            System.out.println("3. Convertir de rva a YIQ");
            System.out.println("4. Convertir de rva a YCbCr");
            System.out.println("5. Convertir de YCbCr a rva");
            System.out.println("6. Convertir de YCbCr a YIQ");
            System.out.println("7. Salir");
            System.out.println(" -----------------------------");
            
            try{
                System.out.print("Ingrese la opción deseada: ");
                option = input.nextInt();
                System.out.println(" -----------------------------");
                if (option==1 || option==2){
                    yiq element1 = new yiq();
                    if (option==1){
                        element1.rva();
                    } else{
                        element1.ycbcr();
                    } 
                } else if (option==3 || option==4){
                    rva element2 = new rva();
                    if (option==3){
                        element2.yiq();
                    } else{
                        element2.ycbcr();
                    } 
                } else if (option==5 || option==6){
                    ycbcr element3 = new ycbcr();
                    if (option==3){
                        element3.rva();
                    } else{
                        element3.yiq();
                    } 
                } else if(option==7){
                    value=false;
                } else{
                    System.out.println("La opción no existe.");
                }
            } catch(InputMismatchException NN){ // Manejo de errores
                System.out.println("Operación no permitida, se debe ingresar un número.");
                break;
            }
        }
    }
}
