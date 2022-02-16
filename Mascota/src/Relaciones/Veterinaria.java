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
public class Veterinaria {
    private String nombre;
    private String direccion;
    private int telefono;
    private Doctor doctor;

    public Veterinaria(String nombre, String direccion, int telefono, Doctor doctor) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.doctor = doctor;
    }
  
    public String cuidarMascota(Mascota pet){
        System.out.println(pet.getNombre()+" está siendo cuidado");
        return pet.getEstadoSalud();
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
}
