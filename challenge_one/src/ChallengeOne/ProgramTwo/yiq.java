package ChallengeOne.ProgramTwo;

/**
 * Clase hija para hacer la conversión del espacio color YIQ a rva y/o YCbCr.
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */

public class yiq extends Converter{
    
    // Constructor
    public yiq(){
        System.out.print("Ingresa el valor de Y: ");
        y = input.nextFloat();
        System.out.print("Ingresa el valor de I: ");
        i = input.nextFloat();
        System.out.print("Ingresa el valor de Q: ");
        q = input.nextFloat();
    }
    
    // Método para pasar YIQ a rva e imprimir el resultado.
    public void rva(){
        r = (float) (y + 0.955*i + 0.618*q);
        v = (float) (y - 0.271*i - 0.645*q);
        a = (float) (y - 1.11*i + 1.7*q);
        System.out.println(" -----------------------------");
        System.out.println("La conversión de YIQ a rva es r: "+r+", v: "+v+", a: "+a);
    }
    
    // Método para pasar YIQ a YCbCr e imprimir el resultado.
    public void ycbcr(){
        rva();
        y = (float) (0.299*r + 0.587*v + 0.114*a);
        Cb = (float) (0.1687*r - 0.3313*v - 0.5*a);
        Cr = (float) (0.5*r - 0.418*v + 0.0813*a);
        System.out.println(" -----------------------------");
        System.out.println("La conversión de YIQ a YCbCr es Y: "+y+", Cb: "+Cb+", Cr: "+Cr);
    } 
}
