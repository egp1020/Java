/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.*;
import Model.*;

/**
 *
 * @author estefania.garces
 */
public class ctlPet {
    private modelDog modelDog;
    private modelCat modelCat;
    public ctlPet() {
        this.modelDog = new modelDog();
        this.modelCat= new modelCat();
    }
    
    public boolean CreatePet(Pet pet){
        try{
            switch(pet.getAnimalType()){
                case "Gato":
                    this.modelCat.CreatePet((Cat) pet);
                    break;
                case "Perro":
                    this.modelDog.CreatePet((Dog)pet);
                    break;
            }
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public boolean EditPet(Pet pet){
        try{
            switch(pet.getAnimalType()){
                case "Gato":
                    this.modelCat.EditPet((Cat) pet);
                    break;
                case "Perro":
                    this.modelDog.EditPet((Dog) pet);
                    break;
            }
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public boolean DeletePet(Pet pet){
        try{
            switch(pet.getAnimalType()){
                case "Gato":
                    this.modelCat.DeletePet((Cat) pet);
                    break;
                case "Perro":
                    this.modelDog.DeletePet((Dog) pet);
                    break;
            }
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public Pet SearchPet(int code, String type){
        Pet pet = null;
        try{
            switch(type){
                case "Gato":
                    pet = this.modelCat.SearchPet(code);
                    break;
                case "Perro":
                    pet = this.modelDog.SearchPet(code);
                    break;
            }
            return pet;
        } catch(Exception e){
            return null;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
}
