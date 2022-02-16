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
 * POLIMORFISMO DE SOBREESCRITURA
 * El polimorfismo de sobreescritura de métodos está asociado directamente a la relación entre clases llamada herencia.
 * El polimorfismo de sobreescritura de métodos se realiza mediante la agregación de una anotación antes de la firma del 
 * método, la anotación es @override.
 */
public class Polymorphism2 {
    public static void main(String[] args) {
        // Instancias de las clases hijas
        Dog dog = new Dog("Firulais", "Negro", "Sano", 001, 2013, "Criollo", true);
        Cat cat = new Cat("Minino", "Blanco", "Enfermo", 002, 2013, "Angora");
        Pet pet = new Pet("MINI", "Amarillo", "sano", 002, 2017);
        
        // En un primer momento, ambos hacen el mismo sonido.
        // Después de aplicar la opción de @Override y la clase que genera el 
        // sonido, se genera sonidos diferentes.
        dog.Sound();
        cat.Sound();
        pet.Sound();
        
    }
}
