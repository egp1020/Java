/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author estefania.garces
 */
public class modelDog {
    DbData dbData;
    
    public modelDog() {
    }
    
    public boolean CreatePet(Dog dog){
        try(Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "INSER INTO tb_pet(code, name, born_year, color, health_status) VALUES (?,?,?,?,?)";
            PreparedStatement statementPet = conn.prepareStatement(query);
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public boolean EditPet(Dog dog){
        try{
            
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public boolean DeletePet(Dog dog){
        try{
            return true;
        } catch(Exception e){
            return false;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
    
    public Pet SearchPet(int code){
        Dog dog = null;
        try{
            return dog;
        } catch(Exception e){
            return dog;
        }
        //if(pet.getAnimalType().equals("Felino")){}else{}
    }
}
