/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones;

/**
 *
 * @author estefania.garces
 */
public class Gato extends Mascota{
    private String raza;

    public Gato(String raza, int codigo, int anioNacimiento, String nombre, String color, String estadoSalud) {
        super(codigo, anioNacimiento, nombre, color, estadoSalud);
        this.raza = raza;
    }
   
    public void Limpiar(){
        System.out.println(super.getNombre()+" se está bañando.");
    }
    
    @Override
    public void Sonido(){
        System.out.println(super.getNombre()+" está maullando.");
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public int obtenerNumeroHuesos() {
        return 230;
    }
    
    @Override
    public String obtenerTipoAnimal() {
        return "Gato";
    }
    
}
