/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petmanager;

import Classes.Dog;
import Classes.Cat;

/**
 *
 * @author estefania.garces
 */
public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog("Firulais", "Negro", "Sano", 001, 2013, "Criollo", true);
        Cat cat = new Cat("Minino", "Blanco", "Enfermo", 002, 2013, "Angora");
        
        String dogType = dog.getAnimalType();
        
        int dogBones = dog.getNumberOfBones();
        int catBones = cat.getNumberOfBones();
        
        System.out.println(dogType);
        System.out.println(""+cat.getAnimalType());
        System.out.println(cat.getAnimalType());
        System.out.println(dogBones);
        System.out.println(catBones);
        
    }
}
