/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petmanager;

import Classes.*;

/**
 *
 * @author Estefanía Garcés Pérez
 * 
 * POLIFORMISMO PURO
 * 
 * Cuando se define la relación de herencia entre las clases A y B, 
 * donde A es la clase padre y B es la clase hija, los métodos de A 
 * que solo puede acceder la clase B son los que están marcados con 
 * el acceso Protected.
 * 
 * Cuando se define la relación de herencia entre las clases A y B, 
 * donde A es la clase padre y B es la clase hija, y en una clase C 
 * se tiene un método que recibe un parámetro de tipo A, ¿es posible 
 * pasarle un objeto de tipo B a dicho método?:
 * Si, porque cuando se tiene la relación de herencia, un objeto B se 
 * puede tomar como tipo A.
 * 
 */
public class Polymorphism {
    public static void main(String[] args) {
        // Instancias de las clases hijas
        Dog perro= new Dog("Firulais", "Negro", "Sano", 001, 2013, "Criollo", true);
        Cat gato = new Cat("Minino", "Blanco", "Enfermo", 002, 2013, "Angora");
        
        // Instancia de doctor y veterinaria
        Doctor doct = new Doctor("Pedrito María", "LI12345");
        Veterinary vtn= new Veterinary("Veterinaria UDS", "000 358 25 25", "Calle Bolivar con la 65", doct);
    
        String careDog = vtn.petCare(perro);
        String careCat = vtn.petCare(gato);
        
        System.out.println("El estado de salud de "+perro.getName() +" es "+careDog);
        System.out.println("El estado de salud de "+gato.getName() +" es "+careCat);
    }
}
