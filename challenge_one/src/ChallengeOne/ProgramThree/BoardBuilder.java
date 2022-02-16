package ChallengeOne.ProgramThree;

import java.util.Scanner;

/**
 * Esta clase se encarga de generar un tablero con cuadros negros y blancos.
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 *
 */
public class BoardBuilder {
    // Atributos
    private int length,i, j, k;
    private String white, black, drawing;
    private boolean generalSequence, sequence;
    Scanner input;
    
    // Método constructor
    public BoardBuilder(){
        input = new Scanner(System.in);
        System.out.print("Ingrese la longitud del tablero: ");
        length = input.nextInt();
    }
    
    // Método que construye el tablero
    public void Board(){
        white = "   ";
        black = "***";
        generalSequence = false;
        
        for (i=0;i<length;i++){
            if (generalSequence){
                generalSequence = false;
            }else{
                generalSequence = true;
            }
            drawing = "";
            
            for (j=0;j<3;j++){
                sequence = generalSequence;
                drawing = "";
                
                for(k=0;k<length;k++){
                    if (sequence){
                        drawing += white;
                        sequence = false;
                    }else{
                        drawing += black;
                        sequence = true;
                    }
                }
                System.out.println(drawing);
            }  
        }  
    }
}
