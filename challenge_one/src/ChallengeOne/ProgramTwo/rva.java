package ChallengeOne.ProgramTwo;

/**
 * Clase hija para hacer la conversión del espacio color rva a yiq y/o YCbCr.
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */
public class rva extends Converter{
    
    // Constructor
    public rva(){
        System.out.print("Ingresa el valor de r: ");
        r = input.nextFloat();
        System.out.print("Ingresa el valor de v: ");
        v = input.nextFloat();
        System.out.print("Ingresa el valor de a: ");
        a = input.nextFloat();
        System.out.println(" -----------------------------");
            
        y = (float) (0.299*r + 0.587*v + 0.114*a);
    }
    
    // Método para pasar rva a YIQ e imprimir el resultado.
    public void yiq(){
        i = (float) (0.596*r - 0.275*v - 0.321*a);
        q = (float) (0.212*r - 0.528*v + 0.311*a);
        System.out.println("La conversión de rva a YIQ es Y: "+y+", I: "+i+", Q: "+q);
    }
    
    // Método para pasar rva a YCbCr e imprimir el resultado.
    public void ycbcr(){
        yiq();
        Cb = (float) (0.1687*r - 0.3313*v - 0.5*a);
        Cr = (float) (0.5*r - 0.418*v + 0.0813*a);
        System.out.println("La conversión de YIQ a YCbCr es Y: "+y+", Cb: "+Cb+", Cr: "+Cr);
    } 
}
