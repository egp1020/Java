/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author estefania.garces
 */
public class Cat extends Pet{
    private String breed;
    
    public Cat(String name, String color, String healthStatus, int code, int bornYear){
        super(name, color, healthStatus, code, bornYear);
    }
    public Cat(String name, String color, String healthStatus, int code, int bornYear, String breed) {
        super(name, color, healthStatus, code, bornYear);
        this.breed = breed;
    }
    
    public void SelfCleaning(){
        System.out.println(super.getName()+" se está aseando"); //esto es porque los atributos son privados
    }
    
    @Override // sirve para cambiar métodos de la clase padre.
    public void Sound(){
        System.out.println("El gato "+super.getName()+" hace Miauuu!");
    }
    
    @Override
    public int getNumberOfBones(){
        return 230;
    }
    
    @Override
    public String getAnimalType(){
        return "Gato";
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
