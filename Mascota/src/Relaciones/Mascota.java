/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones;

import Intefaces.IAnimal;
import Intefaces.IVertebrado;

/**
 *
 * @author estefania.garces
 */
public class Mascota implements IAnimal, IVertebrado{
    private int codigo;
    private int anioNacimiento;
    private String nombre;
    private String color;
    private String estadoSalud;
    private Veterinaria veterinaria;

    public Mascota(int codigo, int anioNacimiento, String nombre, String color, String estadoSalud) {
        this.codigo = codigo;
        this.anioNacimiento = anioNacimiento;
        this.nombre = nombre;
        this.color = color;
        this.estadoSalud = estadoSalud;
    }
    
    public void Comer(){
        System.out.println(this.nombre+" está comiendo.");
    }
    
    public void Mover(){
        System.out.println(this.nombre+" está moviendose.");
    }
    
    public void Sonido(){
        System.out.println(this.nombre+" está generando un sonido");
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the anioNacimiento
     */
    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    /**
     * @param anioNacimiento the anioNacimiento to set
     */
    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the estadoSalud
     */
    public String getEstadoSalud() {
        return estadoSalud;
    }

    /**
     * @param estadoSalud the estadoSalud to set
     */
    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    /**
     * @return the veterinaria
     */
    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    /**
     * @param veterinaria the veterinaria to set
     */
    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    @Override
    public String obtenerTipoAnimal() {
        return "Animal";
    }
    

    @Override
    public int obtenerNumeroHuesos() {
        return 0;
    }
}
