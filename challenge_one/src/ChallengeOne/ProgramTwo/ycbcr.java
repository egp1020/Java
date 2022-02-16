package ChallengeOne.ProgramTwo;

/**
 * Clase hija para hacer la conversión del espacio color YCbCr a rva y/o yiq.
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */
public class ycbcr extends Converter{
    
    // Constructor
    public ycbcr(){
        System.out.print("Ingresa el valor de Y: ");
        y = input.nextFloat();
        System.out.print("Ingresa el valor de Cb: ");
        Cb = input.nextFloat();
        System.out.print("Ingresa el valor de Cr: ");
        Cr = input.nextFloat();
    }
    
    
    // Método para pasar de YCbCr a rva e imprimir el resultado.
    public void rva(){
        r = (float) (y + 1.402*Cr);
        v = (float) (y + 0.344*Cb - 0.714*Cr);
        a = (float) (y + 1.772*Cb);
        
        System.out.println(" -----------------------------");
        System.out.println("La conversión de YCbCr a rva es r: "+r+", v: "+v+", a: "+a);
    }
    
    // Método para pasar de YCbCr a YIQ e imprimir el resultado.
    public void yiq(){
        rva();
        y = (float) (0.299*r + 0.587*v + 0.114*a);
        i = (float) (0.596*r - 0.275*v - 0.321*a);
        q = (float) (0.212*r - 0.528*v + 0.311*a);
        
        System.out.println(" -----------------------------");
        System.out.println("La conversión de rva a YIQ es Y: "+y+", I: "+i+", Q: "+q);
    }
    
    
}
