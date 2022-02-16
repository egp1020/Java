package ChallengeOne.ProgramThree;
import java.util.Scanner;

/**
 * Esta clase contiene los atributos y los métodos que me generan
 * la distancia recorrida de un objeto en cada segundo.
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */
public class FreeFallSimulator {
    
    // Atributos
    private float h, d;
    private float tf, g;
    private int t;
    private String text;
    private Scanner input;
    
    // Método constructor
    public FreeFallSimulator() {
        input = new Scanner(System.in);
        
        System.out.print("Ingrese la altura: ");
        h = input.nextFloat();
    }
    
    /**
     * Método donde se hacen los cálculos correspondientes.
     * @return Un mensaje con la distancia recorrida en cada segundo.
     * 
    */
    public String distanceTime(){
        g = (float) 9.8;
        t = 0;
        tf = (float) Math.sqrt(2*h/9.8);
        text = "";
   
        while(d<=h){
            d = (float) (Math.pow(t,2)*(g/2));
            if(d<h){
                text = text + "En el segundo "+ t + " se recorrió "+d+" metros.\n";
            }
            else{
                text = text + "En el segundo "+Math.round(tf*100)/100.0+" se recorrió "+h+" metros.";
            }
            t++;
        }
        return text; 
    }
}
