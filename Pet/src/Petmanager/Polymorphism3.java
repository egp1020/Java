/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petmanager;

import Classes.Dog;

/**
 *
 * @author estefania.garces
 * 
 * POLIMORFISMO DE SOBRECARGA
 * 
 * Un conjunto de métodos que tienen el mismo nombre pero diferentes tipos y cantidad de parámetros.
 */
public class Polymorphism3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Kiko", "Negro", "Sano", 001, 2013, "Criollo", true);
        dog1.WalkAroud();
        dog1.WalkAround(5);
        dog1.WalkAround(true);
    }
}
