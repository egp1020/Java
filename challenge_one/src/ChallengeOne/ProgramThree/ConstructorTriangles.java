package ChallengeOne.ProgramThree;

import java.util.Scanner;

/**
 * Esta clase se encarga de generar un triángulo con números consecutivos.
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */
public class ConstructorTriangles {
    
    // Atributos
    private int tier, row, n, i, numbers;
    private String eachTier;
    private Scanner input;
    
    // Método constructor
    public ConstructorTriangles(){
        input = new Scanner(System.in);
        System.out.print("Ingrese el número de pisos: ");
        tier = input.nextInt();
    }
    
    /**
     * Método donde se realizan todos los cálculos correspondientes.
     * @return En forma de String, un triángulo construido por números
     * consecutivos.
     */
    public String Triangle(){
        row = 1;
        n = 1;
        eachTier = "";
        
        while (row <= tier){
            for (int i=0; i<row;i++){
                numbers = n + i;
                eachTier = eachTier + ' ' + numbers;
            }
            eachTier = eachTier + '\n';
            n = numbers+1;
            row++;
        }
        return eachTier;
    }    
}
