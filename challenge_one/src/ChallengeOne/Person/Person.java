package ChallengeOne.Person;

/**
 *
 * @author Estefanía Garcés Pérez
 */
public class Person {
    private int age, height, ID;
    private float weight;
    private String fullName, nationality, gender, skinColor, hairType;
    
    public Person(String f, int ID, String n, int a, String g, int h,  float w, String s, String hT){ 
        this.fullName = f;
        this.ID = ID;
        this.nationality = n;
        this.age = a;
        this.gender = g;
        this.height = h;
        this.weight = w;
        this.skinColor = s;
        this.hairType = hT;
    }
    
    public void Register(){
        System.out.println("Los datos registrados en la base de datos son: ");
        System.out.println("Nombre completo: "+fullName);
        System.out.println("ID: "+ID);
        System.out.println("Nacionalidad: "+nationality);
        System.out.println("Edad: "+age);
        System.out.println("Genero: "+gender);
        System.out.println("Estatura: "+height);
        System.out.println("Peso: "+weight);
        System.out.println("Color de piel: "+skinColor);
        System.out.println("Tipo de cabello: "+hairType);
    }
    
    public void Stretch(){
        System.out.println(fullName+" está estirando.");
    }
    
    public void Bath(){
        System.out.println(fullName+" está bañandose.");
    }
    
    public void Eat(){
        System.out.println(fullName+" está comiendo.");
    }
    
    public void DrinkCoffe(){
        System.out.println(fullName+" está bebiendo café.");
    }
    
    public void Read(){
        System.out.println(fullName+" está leyendo.");
    }
    
    public void Study(){
        System.out.println(fullName+" está estudiando.");
    }
    
    public void Programming(){
        System.out.println(fullName+" está programando.");
    }
    
    public void Sleep(){
        System.out.println(fullName+" está durmiendo.");
    }
}
