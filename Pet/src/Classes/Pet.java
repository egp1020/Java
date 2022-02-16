/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Interfaces.IVertebrate;
import Interfaces.IAnimal;

/**
 *
 * @author Estefanía Garcés Pérez
 */
public class Pet implements IAnimal, IVertebrate{
    // Agregado a Veterinary --- Going to
    private String name, color, healthStatus;
    private int code, born_year;
    private Veterinary vt;
    
    public Pet(){}
    public Pet(String n, String cl, String hS, int cd, int bY){
        this.name = n;
        this.code = cd;
        this.born_year = bY;
        this.color = cl;
        this.healthStatus = hS;
    }
    
    public void Eat(){
        System.out.println("La mascota "+this.name+" está comiendo");
    }
    
    public void Move(){
        System.out.println("La mascota "+this.name+" se está moviendo");
    }
    
    public void Sound(){
        System.out.println("La mascota "+this.name+" está generando un sonido");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the healthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * @param healthStatus the healthStatus to set
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    /**
     * @return the vt
     */
    public Veterinary getVt() {
        return vt;
    }

    /**
     * @param vt the vt to set
     */
    public void setVt(Veterinary vt) {
        this.vt = vt;
    }

    @Override
    public String getAnimalType() {
        return "Doméstico"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfBones() {
        return 0;
    }
}
