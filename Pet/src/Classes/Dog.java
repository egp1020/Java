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
public class Dog extends Pet{
    private String breed;
    private boolean pedigree;
    
    public Dog(String n, String cl, String hS, int cd, int bY, String b, boolean p) {
        super(n, cl, hS, cd, bY);
         this.breed = b;
         this.pedigree = p;
    }
    
    public void WalkAroud(){
        System.out.println(super.getName()+" se está paseando solo.");
    }
    
    @Override // sirve para cambiar métodos de la clase padre.
    public void Sound(){
        System.out.println("El perro "+super.getName()+" hace Guauu!");
    
    }
    
    // Pilimorfismo 3: sobrecarga
    public void WalkAround(int km){
        System.out.println(super.getName()+" está caminando "+km+" km.");
    }
    
    public void WalkAround(boolean dogLeash){
        String hasLeash = dogLeash ? "con correa" : "sin correa";
        System.out.println(super.getName()+" está caminando "+hasLeash);
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

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    @Override
    public String getAnimalType(){
        return "Perro";
    }
    
}
