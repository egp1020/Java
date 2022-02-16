/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Cat;
import Classes.Pet;

/**
 *
 * @author estefania.garces
 */
public class modelCat {

    public modelCat() {
    }
     
    public boolean CreatePet(Cat cat){
        try{
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public boolean EditPet(Cat cat){
        try{
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public boolean DeletePet(Cat cat){
        try{
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public Pet SearchPet(int code){
        Cat cat = null;
        try{
            return cat;
        } catch(Exception e){
            return cat;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
}
