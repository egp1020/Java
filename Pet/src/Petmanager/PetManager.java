package Petmanager;


//import SemanaDos.Relaciones.Pet;
import Classes.Pet;
import Classes.Dog;
import Classes.Cat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author estefania.garces
 */
public class PetManager {
    public static void main(String[] args) {
        String nombre, color, salud;
        int code, anio_nacimiento;
        Scanner input;
        
        
        input = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese el color: ");
        color = input.next();
        System.out.print("Ingrese el estado de salud: ");
        salud = input.next();
        System.out.print("Ingrese el ID: ");
        code = input.nextInt();
        System.out.print("El año de nacimiento: ");
        anio_nacimiento = input.nextInt(); 
        
        Pet pet1 = new Pet(nombre, color, salud, code, anio_nacimiento);
        Dog dog1 = new Dog("Kiko", "Negro", "Sano", 001, 2013, "Criollo", true);
        Pet pet2 = new Pet("Piko", "Blanco", "Enfermo", 002, 2013);
        Cat cat1 = new Cat("Minino", "Blanco", "Enfermo", 002, 2013, "Angora");
        
        System.out.print(nombre);
        System.out.print(color);
        System.out.print(salud);
        System.out.print(code);
        System.out.print(anio_nacimiento);
        
        Date current_date = new Date();
        int current_year = current_date.getYear();
        
        int agePet1 = current_year - dog1.getBorn_year();
        int agePet2 = current_year - cat1.getBorn_year();
        
        if (agePet1 > agePet2){
            System.out.println("La mascota "+ dog1.getName()+" es mayor que la mascota "+pet2.getName());
        }else{
            if (agePet1 < agePet2){
                System.out.println("La mascota "+ cat1.getName()+" es mayor que la mascota "+pet1.getName());
            }else{
                System.out.println("La mascota "+ dog1.getName()+" tiene la misma edad que la mascota "+pet2.getName());
            }
        }
        System.out.println("---------------------------------------------------");
        pet1.Eat();
        pet1.Move();
        pet1.Sound();
        pet1.setName("Machitas");
        System.out.println(pet1.getName());
        
        System.out.println("---------------------------------------------------");
        dog1.Eat();
        dog1.Move();
        dog1.Sound();
        dog1.WalkAroud();
        System.out.println("---------------------------------------------------");
        cat1.Eat();
        cat1.Move();
        cat1.Sound();
        cat1.SelfCleaning();
        System.out.println("---------------------------------------------------");
        pet2.Eat();
        pet2.Move();
        pet2.Sound();
    }
}
