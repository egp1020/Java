package ChallengeOne.Person;
import java.util.Scanner;

/**
 * Método encargado de hacer la ejecución del programa
 * Es el método principal del proyecto
 * @author Estefanía Garcés Pérez
 * @version 2.0.0
 */
public class Run {
    public static void main(String[] args){
        int age, height, ID;
        float weight;
        String fullName, nationality, gender, skinColor, hairType;
        Scanner input = new Scanner(System.in);
        
        // Registrarse
        
        System.out.println(" ------------------------------------------------------ ");
        System.out.println("|                Registrando usuario(a)                |");
        System.out.println(" ------------------------------------------------------ ");
        System.out.print("Ingresa tu nombre completo: ");
        fullName = input.nextLine();
        System.out.print("Ingresa tu número de identificación: ");
        ID = input.nextInt();
        System.out.print("Ingresa tu nacionalidad: ");
        nationality = input.next();
        System.out.print("Ingresa tu edad: ");
        age = input.nextInt();
        System.out.print("Ingresa tu genero [M/F]: ");
        gender = input.next();
        System.out.print("Ingresa tu estatura [cm]: ");
        height= input.nextInt();
        System.out.print("Ingresa tu peso [kg]: ");
        weight = input.nextFloat();
        System.out.print("Ingresa el color de tu piel: ");
        skinColor = input.next();
        System.out.print("Ingresa el tipo de cabello que tienes: ");
        hairType = input.next();
        
        //Crear instancia
        Person registerOne = new Person(fullName, ID, nationality, age, gender, height, weight, skinColor, hairType);
        
        System.out.println(" ------------------------------------------------------ ");
        System.out.println("|                   Mirando registro                   |");
        System.out.println(" ------------------------------------------------------ ");
        registerOne.Register();
        
        System.out.println(" ------------------------------------------------------ ");
        System.out.println("|                    Mirando rutina                    |");
        System.out.println(" ------------------------------------------------------ ");
        registerOne.Stretch();
        registerOne.Bath();
        registerOne.Eat();
        registerOne.DrinkCoffe();
        registerOne.Read();
        registerOne.Study();
        registerOne.Programming();
        registerOne.Sleep();
    }
}
